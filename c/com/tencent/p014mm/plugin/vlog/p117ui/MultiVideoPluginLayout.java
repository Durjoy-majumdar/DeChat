package com.tencent.p014mm.plugin.vlog.p117ui;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import ai2.C92007a;
import ai2.C92010c;
import ai2.C92011d;
import ai2.C92012f;
import ai2.C92018l;
import ai2.C92023q;
import ai2.C92025s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import ci2.C104380d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
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
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.xweb.IXWebBroadcastListener;
import d23.C106976a;
import e23.C107165b;
import e23.C97592a;
import e23.C97593c;
import e23.C97595e;
import ei2.C31606c;
import ei2.C97651f;
import f14.C58901s;
import f23.C97814a;
import f23.C97822c;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C59917q;
import hi2.C98453h;
import hi2.C98459j;
import hi2.C98463n;
import hi2.C98464o;
import i23.C8847a;
import i33.C98595b;
import ih2.C60287a;
import j20.C117292a;
import j23.C108531a;
import j23.C108536c;
import j23.C98900g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import l23.C109154a;
import l23.C109165b0;
import l23.C109168c0;
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
import l23.C99327z;
import lh2.C109344g0;
import lh2.C109348i;
import lh2.C109359m;
import lh2.C99426e;
import lh2.C99447k;
import lh2.C99448l;
import lw1.C99685b;
import m23.C109475c;
import o23.C109923a;
import o40.C61926c;
import org.json.JSONObject;
import p143ds.C7510m;
import p171il.C98744t;
import p23.C110130b;
import p813fl.C97927q0;
import p813fl.C97940x;
import p813fl.C97942y;
import p813fl.C97944z;
import q23.C110351a;
import qh2.C101198e;
import r23.C110496a;
import rr3.C110625c0;
import rr3.C110629f;
import rr3.C110630g;
import rr3.C110632i;
import rr3.C110642r;
import rr3.C110644t;
import rr3.C110646v;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C13605o;
import sp3.C110801c;
import sp3.C110803f;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C36907w;
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
import yx3.C91590f;
import yx3.C91594j;
import zg2.C103020m;
import zp3.C112660e0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "Ll23/j$b;", "Ld23/a$c;", "template", "Lrx3/b0;", "setupTemplateVideoPlugins", "", "selectFirst", "setupImageEditPlugins", "Ll23/j;", "J", "Ll23/j;", "getMultiPreviewPlugin", "()Ll23/j;", "setMultiPreviewPlugin", "(Ll23/j;)V", "multiPreviewPlugin", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "a1", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "getCurrentStyle", "()Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "setCurrentStyle", "(Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;)V", "currentStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout */
public class MultiVideoPluginLayout extends BasePluginLayout implements C101198e, C109202j.C99300b {

    /* renamed from: h1 */
    public static final /* synthetic */ int f316622h1 = 0;

    /* renamed from: A */
    public final C61205o0 f316623A;

    /* renamed from: B */
    public final C109923a f316624B;

    /* renamed from: C */
    public String f316625C = "";

    /* renamed from: D */
    public boolean f316626D = true;

    /* renamed from: E */
    public RecordConfigProvider f316627E;

    /* renamed from: F */
    public C98324b f316628F;

    /* renamed from: G */
    public C106195f0 f316629G = new C106195f0();

    /* renamed from: H */
    public boolean f316630H;

    /* renamed from: I */
    public boolean f316631I;

    /* renamed from: J */
    public C109202j f316632J;

    /* renamed from: K */
    public C61196g f316633K;

    /* renamed from: L */
    public C109168c0 f316634L;

    /* renamed from: M */
    public C109232t0 f316635M;

    /* renamed from: N */
    public final C109235u0 f316636N;

    /* renamed from: P */
    public final C109154a f316637P;

    /* renamed from: Q */
    public final C110130b f316638Q;

    /* renamed from: Q0 */
    public final C109201i0 f316639Q0;

    /* renamed from: R */
    public C59917q f316640R = new C59917q();

    /* renamed from: R0 */
    public final C109245y0 f316641R0;

    /* renamed from: S */
    public final C99324x f316642S;

    /* renamed from: S0 */
    public final C109190g0 f316643S0;

    /* renamed from: T */
    public final C99327z f316644T;

    /* renamed from: T0 */
    public final View f316645T0;

    /* renamed from: U */
    public final C109165b0 f316646U;

    /* renamed from: U0 */
    public final View f316647U0;

    /* renamed from: V */
    public final C109219q0 f316648V;

    /* renamed from: V0 */
    public boolean f316649V0;

    /* renamed from: W */
    public final C110496a f316650W;

    /* renamed from: W0 */
    public boolean f316651W0;

    /* renamed from: X0 */
    public String f316652X0 = "";

    /* renamed from: Y0 */
    public String f316653Y0 = "";

    /* renamed from: Z0 */
    public ArrayList<GalleryItem$MediaItem> f316654Z0 = new ArrayList<>();

    /* renamed from: a1 */
    public WxCropOperationLayout.C94436h f316655a1 = WxCropOperationLayout.C94436h.RECT_ADJUST;

    /* renamed from: b1 */
    public C110991c f316656b1 = new C110991c();

    /* renamed from: c1 */
    public boolean f316657c1;

    /* renamed from: d1 */
    public C108536c f316658d1 = C108536c.GLOBAL_EDIT;

    /* renamed from: e1 */
    public final int f316659e1 = Color.parseColor("#232323");

    /* renamed from: f1 */
    public boolean f316660f1;

    /* renamed from: g1 */
    public long f316661g1;

    /* renamed from: h */
    public View f316662h;

    /* renamed from: i */
    public C102440a f316663i;

    /* renamed from: j */
    public long f316664j = 60000;

    /* renamed from: n */
    public int f316665n = 1080;

    /* renamed from: o */
    public int f316666o = 1080;

    /* renamed from: p */
    public int f316667p = 90;

    /* renamed from: p0 */
    public final C109213j0 f316668p0;

    /* renamed from: q */
    public String f316669q = "";

    /* renamed from: r */
    public final C110351a f316670r;

    /* renamed from: s */
    public final C109184f0 f316671s;

    /* renamed from: t */
    public final C99426e f316672t;

    /* renamed from: u */
    public final C109348i f316673u;

    /* renamed from: v */
    public final C108531a f316674v;

    /* renamed from: w */
    public final C99318r0 f316675w;

    /* renamed from: x */
    public final C99448l f316676x;

    /* renamed from: x0 */
    public final C109217n0 f316677x0;

    /* renamed from: y */
    public final C99447k f316678y;

    /* renamed from: y0 */
    public final C99306m0 f316679y0;

    /* renamed from: z */
    public final C109475c f316680z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$a */
    public static final class C96568a implements C98744t {

        /* renamed from: a */
        public final /* synthetic */ MultiVideoPluginLayout f282658a;

        public C96568a(MultiVideoPluginLayout multiVideoPluginLayout) {
            this.f282658a = multiVideoPluginLayout;
        }

        /* renamed from: b */
        public void mo127710b(View view, Context context, int i, C97927q0 q0Var) {
            C87412m.m108594g(context, "context");
        }

        /* renamed from: c */
        public void mo127711c(View view, Context context, int i, C97927q0 q0Var) {
            C87412m.m108594g(context, "context");
            if ((q0Var instanceof C97593c ? (C97593c) q0Var : null) != null) {
                MultiVideoPluginLayout multiVideoPluginLayout = this.f282658a;
                Bundle bundle = new Bundle();
                ((C97593c) q0Var).getClass();
                bundle.putString("EDIT_PAG_STICKER_PATH", (String) null);
                multiVideoPluginLayout.mo14585p(C101198e.C101199b.EDIT_ADD_PAG_STICKER, bundle);
            }
            this.f282658a.f316672t.mo138866y().mo136744b(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$b */
    public static final class C96569b extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f282659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96569b(MultiVideoPluginLayout multiVideoPluginLayout) {
            super(2);
            this.f282659d = multiVideoPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            if (intValue != intValue2) {
                String str = this.f282659d.f316629G.f316425d.get(intValue);
                C87412m.m108593f(str, "multiMedia.pathList[from]");
                this.f282659d.f316629G.f316425d.remove(intValue);
                this.f282659d.f316629G.f316425d.add(intValue2, str);
                Log.m105924i("MicroMsg.MultiVideoPluginLayout", "user change image index from:" + intValue + " to:" + intValue2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$e */
    public static final class C96570e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f282660d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C92007a> f282661e;

        /* renamed from: f */
        public final /* synthetic */ C96552p0 f282662f;

        /* renamed from: g */
        public final /* synthetic */ C96543i f282663g;

        /* renamed from: h */
        public final /* synthetic */ String f282664h;

        /* renamed from: i */
        public final /* synthetic */ Size f282665i;

        /* renamed from: j */
        public final /* synthetic */ Rect f282666j;

        /* renamed from: n */
        public final /* synthetic */ Rect f282667n;

        /* renamed from: o */
        public final /* synthetic */ C8479f0<float[]> f282668o;

        /* renamed from: p */
        public final /* synthetic */ C8477a0 f282669p;

        /* renamed from: q */
        public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f282670q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96570e(MultiVideoPluginLayout multiVideoPluginLayout, ArrayList<C92007a> arrayList, C96552p0 p0Var, C96543i iVar, String str, Size size, Rect rect, Rect rect2, C8479f0<float[]> f0Var, C8477a0 a0Var, C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar) {
            super(0);
            this.f282660d = multiVideoPluginLayout;
            this.f282661e = arrayList;
            this.f282662f = p0Var;
            this.f282663g = iVar;
            this.f282664h = str;
            this.f282665i = size;
            this.f282666j = rect;
            this.f282667n = rect2;
            this.f282668o = f0Var;
            this.f282669p = a0Var;
            this.f282670q = qVar;
        }

        public Object invoke() {
            MultiVideoPluginLayout multiVideoPluginLayout = this.f282660d;
            int i = MultiVideoPluginLayout.f316622h1;
            multiVideoPluginLayout.getClass();
            C61926c.m72657B("MultiVideoPluginLayout_report", true, new C98900g(multiVideoPluginLayout, 1));
            C97814a aVar = C97814a.f286944a;
            aVar.mo137153d(this.f282661e);
            aVar.mo137152c(this.f282662f);
            if (this.f282660d.f316651W0) {
                aVar.mo137151b(116);
                AudioCacheInfo audioCacheInfo = this.f282660d.f316674v.f324881p;
                if (audioCacheInfo != null && audioCacheInfo.f163824s) {
                    aVar.mo137151b(117);
                }
            }
            C96543i iVar = this.f282663g;
            String str = this.f282664h;
            C87412m.m108593f(str, "outPath");
            RecordConfigProvider recordConfigProvider = this.f282660d.f316627E;
            C87412m.m108591d(recordConfigProvider);
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            C87412m.m108593f(videoTransPara, "configProvider!!.videoParam");
            C57465w.C57466a.m66223a(iVar, str, videoTransPara, this.f282665i, this.f282666j, false, false, 48, (Object) null);
            this.f282663g.mo134599c(this.f282667n, (float[]) this.f282668o.f27484d, this.f282661e);
            this.f282663g.mo134600d(this.f282660d.f316644T.f291256r.f264201a);
            MultiVideoPluginLayout multiVideoPluginLayout2 = this.f282660d;
            if (multiVideoPluginLayout2.f316649V0) {
                this.f282663g.mo134601e(multiVideoPluginLayout2.f316679y0.mo138709x());
            }
            C64899zy a = this.f282663g.mo81180a();
            a.f186911s = this.f282660d.f316653Y0;
            if (this.f282669p.f27482d) {
                Rect rect = new Rect();
                C96551o.m123876f(a.f186904i.f297899g, rect);
                this.f282662f.mo81183b(rect);
                C31606c e = C96551o.m123875e(a);
                ((C97651f) e).start();
                this.f282662f.mo134622s(e);
                this.f282662f.mo134617n(a.f186904i.f297901i, new C30528i(e, this.f282670q, a));
            } else {
                C96536f fVar = new C96536f();
                fVar.f282497b = false;
                RecordConfigProvider recordConfigProvider2 = this.f282660d.f316627E;
                C87412m.m108591d(recordConfigProvider2);
                VideoTransPara videoTransPara2 = recordConfigProvider2.f272926n;
                C87412m.m108593f(videoTransPara2, "configProvider!!.videoParam");
                fVar.mo81173a(true, videoTransPara2);
                C57463v.C57464a.m66220b(fVar, a, false, new C30530k(this.f282670q), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$f */
    public static final class C96571f extends C87413o implements C32228q<Boolean, String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f282671d;

        /* renamed from: e */
        public final /* synthetic */ int f282672e;

        /* renamed from: f */
        public final /* synthetic */ MultiVideoPluginLayout f282673f;

        /* renamed from: g */
        public final /* synthetic */ C99685b.C99690d f282674g;

        /* renamed from: h */
        public final /* synthetic */ String[] f282675h;

        /* renamed from: i */
        public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f282676i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96571f(C8479f0<String> f0Var, int i, MultiVideoPluginLayout multiVideoPluginLayout, C99685b.C99690d dVar, String[] strArr, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            super(3);
            this.f282671d = f0Var;
            this.f282672e = i;
            this.f282673f = multiVideoPluginLayout;
            this.f282674g = dVar;
            this.f282675h = strArr;
            this.f282676i = captureVideoNormalModel;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            String str = (String) obj2;
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            Log.m105924i("MicroMsg.MultiVideoPluginLayout", "photoEditItemContainer source:" + ((String) this.f282671d.f27484d) + " ret:" + booleanValue + " result:" + str + " index:" + this.f282672e + ' ');
            boolean z = false;
            if (booleanValue && str != null) {
                C109202j multiPreviewPlugin = this.f282673f.getMultiPreviewPlugin();
                String str2 = this.f282673f.f316629G.f316425d.get(this.f282672e);
                C87412m.m108593f(str2, "multiMedia.pathList[index]");
                C106204p C = multiPreviewPlugin.mo160445C(str2);
                C7510m.C7513c c = this.f282674g.mo139054a(str, 1, new Matrix(C.f316483a), new Rect(C.f316484b), new Rect(C.f316486d), new Rect(C.f316485c));
                Bitmap bitmapNative = BitmapUtil.getBitmapNative(c.f25774b);
                MultiVideoPluginLayout multiVideoPluginLayout = this.f282673f;
                C110351a aVar = multiVideoPluginLayout.f316670r;
                String str3 = multiVideoPluginLayout.f316629G.f316425d.get(this.f282672e);
                C87412m.m108593f(str3, "multiMedia.pathList[index]");
                Bitmap F = aVar.mo161848F(str3, C76577a.m92145A(this.f282673f.getContext()));
                if (F != null) {
                    bitmapNative = BitmapUtil.blendBitmap(bitmapNative, F, this.f282673f.getMultiPreviewPlugin().f326967g.getVisibilityRect());
                }
                C98595b bVar = C98595b.f289089a;
                int i = this.f282673f.f316667p;
                C87412m.m108593f(bitmapNative, "blendBitmap");
                bVar.mo137987e(0, i, bitmapNative, c.f25774b);
                bVar.mo137986d(str, c.f25774b);
                this.f282675h[this.f282672e] = C86013q1.m106448i(c.f25774b, false);
                if (booleanValue2 || F != null) {
                    C98453h hVar = C98453h.f288774a;
                    String str4 = c.f25774b;
                    if (!TextUtils.isEmpty(str4) && C86013q1.m106450k(str4)) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C98459j(str4));
                    }
                }
            }
            if (this.f282672e >= this.f282673f.f316629G.f316425d.size() - 1) {
                C98324b bVar2 = this.f282673f.f316628F;
                if (bVar2 != null && bVar2.f288182c) {
                    z = true;
                }
                if (z) {
                    C98453h.f288774a.mo137810h(bVar2 != null ? bVar2.f288189j : null);
                }
                this.f282676i.f272899j.addAll(C110823p.m151001a0(this.f282675h));
                CaptureDataManager.f272890c.mo129794a(this.f282673f.getContext(), this.f282676i);
            } else {
                ArtistCacheManager.m140185a().mo148163f((String) this.f282671d.f27484d);
                this.f282673f.mo152204n(this.f282674g, this.f282675h, this.f282676i, this.f282672e + 1);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$k */
    public static final class C96572k extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f282677d;

        /* renamed from: e */
        public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f282678e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96572k(MultiVideoPluginLayout multiVideoPluginLayout, C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar) {
            super(2);
            this.f282677d = multiVideoPluginLayout;
            this.f282678e = qVar;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            if (!((Boolean) obj).booleanValue()) {
                Log.m105920e("MicroMsg.MultiVideoPluginLayout", "download music failed");
            } else {
                Log.m105924i("MicroMsg.MultiVideoPluginLayout", "download music success, " + str);
                MultiVideoPluginLayout multiVideoPluginLayout = this.f282677d;
                C32228q<Boolean, C64899zy, Bitmap, C13598b0> qVar = this.f282678e;
                int i = MultiVideoPluginLayout.f316622h1;
                multiVideoPluginLayout.mo152203m(str, qVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$l */
    public static final class C96573l extends C87413o implements C32228q<Boolean, C64899zy, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f282679d;

        /* renamed from: e */
        public final /* synthetic */ String f282680e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96573l(MultiVideoPluginLayout multiVideoPluginLayout, String str) {
            super(3);
            this.f282679d = multiVideoPluginLayout;
            this.f282680e = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C64899zy zyVar = (C64899zy) obj2;
            Bitmap bitmap = (Bitmap) obj3;
            this.f282679d.f316623A.mo86128x();
            this.f282679d.mo152198C();
            if (booleanValue) {
                boolean z = false;
                if (zyVar == null) {
                    SightVideoJNI.optimizeMP4VFS(this.f282680e);
                    String str = this.f282680e + "_thumb";
                    C98453h hVar = C98453h.f288774a;
                    String str2 = this.f282680e;
                    C87412m.m108593f(str2, "outPath");
                    C98453h.m127895t(hVar, str2, str, 0, 4, (Object) null);
                    C98464o oVar = C98464o.f288797a;
                    String str3 = this.f282680e;
                    C87412m.m108593f(str3, "outPath");
                    C98464o.C98465a a = oVar.mo137832a(str3);
                    Log.m105924i("MicroMsg.MultiVideoPluginLayout", "vlog video output path:" + this.f282680e + " info:" + a);
                    CaptureDataManager.f272890c.mo129794a(this.f282679d.getContext(), new CaptureDataManager.CaptureVideoNormalModel(Boolean.valueOf(booleanValue), this.f282680e, str, Long.valueOf((long) (a != null ? a.f288800c : 0)), Boolean.FALSE, C110992d.f332425a.mo162676j()));
                    C98324b bVar = this.f282679d.f316628F;
                    if (bVar != null && bVar.f288182c) {
                        z = true;
                    }
                    if (z) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C98463n(bVar));
                    }
                    if (this.f282679d.f316657c1) {
                        hVar.mo137815m(this.f282680e);
                    }
                } else {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    RecordConfigProvider recordConfigProvider = this.f282679d.f316627E;
                    C87412m.m108591d(recordConfigProvider);
                    BitmapUtil.saveBitmapToImage(bitmap, 60, compressFormat, recordConfigProvider.f272902C, true);
                    Boolean bool = Boolean.TRUE;
                    RecordConfigProvider recordConfigProvider2 = this.f282679d.f316627E;
                    C87412m.m108591d(recordConfigProvider2);
                    CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = new CaptureDataManager.CaptureVideoNormalModel(bool, "", recordConfigProvider2.f272902C, -1L, Boolean.FALSE, C110992d.f332425a.mo162676j());
                    C64869yy yyVar = zyVar.f186906n;
                    C98324b bVar2 = this.f282679d.f316628F;
                    if (bVar2 != null) {
                        z = bVar2.f288182c;
                    }
                    yyVar.f186612f = z;
                    CaptureDataManager.f272890c.f272892b.putByteArray("video_composition", zyVar.toByteArray());
                    CaptureDataManager.f272890c.mo129794a(this.f282679d.getContext(), captureVideoNormalModel);
                }
                CaptureDataManager.f272890c.mo129797d(true, C110992d.f332425a.mo162676j());
            } else {
                Log.m105924i("MicroMsg.MultiVideoPluginLayout", " export failed");
                MultiVideoPluginLayout.m142944z(this.f282679d, false, false, 0, 7, (Object) null);
                this.f282679d.f316674v.onResume();
                C61926c.m72668M(new C43275l(this.f282679d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$c */
    public static final class C106226c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f316681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106226c(MultiVideoPluginLayout multiVideoPluginLayout) {
            super(0);
            this.f316681d = multiVideoPluginLayout;
        }

        public Object invoke() {
            this.f316681d.f316670r.mo161855M(false);
            C101198e.C62622a.m73576a(this.f316681d, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$d */
    public /* synthetic */ class C106227d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f316682a;

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
            iArr[62] = 23;
            iArr[137] = 24;
            iArr[50] = 25;
            iArr[45] = 26;
            iArr[46] = 27;
            iArr[93] = 28;
            iArr[19] = 29;
            iArr[74] = 30;
            iArr[75] = 31;
            iArr[76] = 32;
            iArr[77] = 33;
            iArr[78] = 34;
            iArr[100] = 35;
            iArr[101] = 36;
            iArr[114] = 37;
            iArr[99] = 38;
            iArr[94] = 39;
            iArr[95] = 40;
            iArr[105] = 41;
            iArr[106] = 42;
            iArr[96] = 43;
            iArr[97] = 44;
            iArr[98] = 45;
            iArr[109] = 46;
            iArr[110] = 47;
            iArr[108] = 48;
            iArr[113] = 49;
            iArr[111] = 50;
            iArr[112] = 51;
            iArr[115] = 52;
            iArr[116] = 53;
            iArr[117] = 54;
            iArr[118] = 55;
            iArr[120] = 56;
            iArr[121] = 57;
            iArr[119] = 58;
            iArr[107] = 59;
            iArr[127] = 60;
            iArr[126] = 61;
            iArr[125] = 62;
            iArr[128] = 63;
            iArr[72] = 64;
            iArr[73] = 65;
            iArr[122] = 66;
            iArr[123] = 67;
            iArr[124] = 68;
            iArr[129] = 69;
            iArr[130] = 70;
            iArr[131] = 71;
            iArr[132] = 72;
            iArr[134] = 73;
            iArr[133] = 74;
            iArr[135] = 75;
            iArr[136] = 76;
            int[] iArr2 = new int[C108536c.values().length];
            iArr2[2] = 1;
            f316682a = iArr2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$g */
    public static final class C106228g implements CropLayout.C106804b {

        /* renamed from: a */
        public final /* synthetic */ MultiVideoPluginLayout f316683a;

        public C106228g(MultiVideoPluginLayout multiVideoPluginLayout) {
            this.f316683a = multiVideoPluginLayout;
        }

        public void onChange() {
            RectF visibilityRect = this.f316683a.getMultiPreviewPlugin().f326967g.getVisibilityRect();
            C103020m.f303988d.set((int) visibilityRect.left, (int) visibilityRect.top, (int) visibilityRect.right, (int) visibilityRect.bottom);
            C110351a aVar = this.f316683a.f316670r;
            Rect rect = C103020m.f303988d;
            aVar.getClass();
            C87412m.m108594g(rect, "validRect");
            aVar.f330093f.mo152287x(rect);
            MultiVideoPluginLayout multiVideoPluginLayout = this.f316683a;
            multiVideoPluginLayout.f316641R0.mo160480x(multiVideoPluginLayout.getMultiPreviewPlugin().f326967g.getVisibilityRect());
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$h */
    public static final class C106229h implements C109202j.C99301e {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f316684d;

        public C106229h(MultiVideoPluginLayout multiVideoPluginLayout) {
            this.f316684d = multiVideoPluginLayout;
        }

        /* renamed from: k */
        public void mo138704k(long j, Object obj) {
            this.f316684d.f316674v.mo159386F(j);
        }

        public void pause() {
            this.f316684d.f316674v.onPause();
        }

        public void resume() {
            C108531a aVar = this.f316684d.f316674v;
            if (aVar.f324881p != null) {
                aVar.mo159385E();
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$setupNormalVideoPlugins$1", mo125469f = "MultiVideoPluginLayout.kt", mo125470l = {1844}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$i */
    public static final class C106230i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f316685d;

        /* renamed from: e */
        public final /* synthetic */ MultiVideoPluginLayout f316686e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$setupNormalVideoPlugins$1$1", mo125469f = "MultiVideoPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$i$a */
        public static final class C106231a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ MultiVideoPluginLayout f316687d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106231a(MultiVideoPluginLayout multiVideoPluginLayout, C15601d<? super C106231a> dVar) {
                super(2, dVar);
                this.f316687d = multiVideoPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106231a(this.f316687d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106231a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                MultiEditCropOperationLayout multiEditCropOperationLayout = this.f316687d.getMultiPreviewPlugin().f326967g;
                WxCropOperationLayout.C94436h hVar = WxCropOperationLayout.C94436h.RECT_ADJUST;
                multiEditCropOperationLayout.setStyle(hVar);
                this.f316687d.setCurrentStyle(hVar);
                this.f316687d.getMultiPreviewPlugin().mo160450H(this.f316687d.f316674v.mo159392z());
                MultiVideoPluginLayout multiVideoPluginLayout = this.f316687d;
                C109232t0 t0Var = multiVideoPluginLayout.f316635M;
                int size = ((ArrayList) multiVideoPluginLayout.f316629G.f316438t.mo134618o()).size() - 1;
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(Boolean.FALSE);
                }
                t0Var.mo160475y(arrayList);
                MultiVideoPluginLayout multiVideoPluginLayout2 = this.f316687d;
                multiVideoPluginLayout2.setBackgroundColor(multiVideoPluginLayout2.f316659e1);
                MultiVideoPluginLayout multiVideoPluginLayout3 = this.f316687d;
                C108531a aVar = multiVideoPluginLayout3.f316674v;
                C98324b bVar = multiVideoPluginLayout3.f316628F;
                C87412m.m108591d(bVar);
                MultiVideoPluginLayout multiVideoPluginLayout4 = this.f316687d;
                C108531a.m147079H(aVar, bVar, multiVideoPluginLayout4.f316627E, false, multiVideoPluginLayout4.f316630H, multiVideoPluginLayout4.f316629G.f316429h, 4, (Object) null);
                if (this.f316687d.f316629G.f316438t.f282570c.size() == 1) {
                    long j = this.f316687d.f316629G.f316438t.f282570c.get(0).f316501l.f331470h;
                    MultiVideoPluginLayout multiVideoPluginLayout5 = this.f316687d;
                    if (j > multiVideoPluginLayout5.f316664j) {
                        multiVideoPluginLayout5.mo152205o();
                        this.f316687d.f316641R0.getClass();
                        C106976a aVar2 = C106976a.f320208a;
                        this.f316687d.f316629G.mo152116i(0);
                        MultiVideoPluginLayout multiVideoPluginLayout6 = this.f316687d;
                        multiVideoPluginLayout6.f316636N.mo160476x().setEnableLengthEdit(!multiVideoPluginLayout6.f316629G.mo152121r());
                        MultiVideoPluginLayout multiVideoPluginLayout7 = this.f316687d;
                        C109235u0 u0Var = multiVideoPluginLayout7.f316636N;
                        C106205q0 q0Var = multiVideoPluginLayout7.f316629G.f316442x;
                        C87412m.m108591d(q0Var);
                        C109235u0.m148334y(u0Var, q0Var, true, 0, 4, (Object) null);
                        this.f316687d.getMultiPreviewPlugin().mo160450H(this.f316687d.f316674v.mo159392z());
                        return C13598b0.f38549a;
                    }
                }
                long m = this.f316687d.f316629G.f316438t.mo134616m();
                MultiVideoPluginLayout multiVideoPluginLayout8 = this.f316687d;
                if (m > multiVideoPluginLayout8.f316664j) {
                    multiVideoPluginLayout8.mo152205o();
                    this.f316687d.f316641R0.getClass();
                    C106976a aVar3 = C106976a.f320208a;
                    this.f316687d.f316629G.mo152116i(-1);
                    this.f316687d.f316635M.setVisibility(8);
                    MultiVideoPluginLayout multiVideoPluginLayout9 = this.f316687d;
                    C106195f0 f0Var = multiVideoPluginLayout9.f316629G;
                    C109154a aVar4 = multiVideoPluginLayout9.f316637P;
                    C96552p0 p0Var = f0Var.f316438t;
                    aVar4.mo160400y(p0Var);
                    f0Var.mo152110a(p0Var, false);
                    MultiVideoPluginLayout multiVideoPluginLayout10 = this.f316687d;
                    multiVideoPluginLayout10.f316637P.mo160396B(multiVideoPluginLayout10.f316629G.f316438t, multiVideoPluginLayout10.f316664j);
                    this.f316687d.getMultiPreviewPlugin().mo160450H(this.f316687d.f316674v.mo159392z());
                    FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
                    Log.m105924i("MicroMsg.FinderVideoShell", "markShowCrop60s");
                    if (FinderVideoShell.f82204g <= 0) {
                        FinderVideoShell.f82204g = Util.currentTicks();
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106230i(MultiVideoPluginLayout multiVideoPluginLayout, C15601d<? super C106230i> dVar) {
            super(2, dVar);
            this.f316686e = multiVideoPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106230i(this.f316686e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106230i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f316685d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f316686e.f316629G.mo152111b();
                C30517h0.m39115d();
                this.f316686e.f316674v.mo159384D();
                MultiVideoPluginLayout multiVideoPluginLayout = this.f316686e;
                multiVideoPluginLayout.f316641R0.getClass();
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C106231a aVar2 = new C106231a(multiVideoPluginLayout, (C15601d<? super C106231a>) null);
                this.f316685d = 1;
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$setupTemplateVideoPlugins$1", mo125469f = "MultiVideoPluginLayout.kt", mo125470l = {1902}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$j */
    public static final class C106232j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f316688d;

        /* renamed from: e */
        public final /* synthetic */ MultiVideoPluginLayout f316689e;

        /* renamed from: f */
        public final /* synthetic */ C106976a.C31054c f316690f;

        /* renamed from: g */
        public final /* synthetic */ boolean f316691g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$setupTemplateVideoPlugins$1$1", mo125469f = "MultiVideoPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$j$a */
        public static final class C106233a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ boolean f316692d;

            /* renamed from: e */
            public final /* synthetic */ MultiVideoPluginLayout f316693e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106233a(boolean z, MultiVideoPluginLayout multiVideoPluginLayout, C15601d<? super C106233a> dVar) {
                super(2, dVar);
                this.f316692d = z;
                this.f316693e = multiVideoPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106233a(this.f316692d, this.f316693e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106233a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                if (this.f316692d) {
                    C109202j.m148263J(this.f316693e.getMultiPreviewPlugin(), true, true, false, 0, 4, (Object) null);
                } else {
                    this.f316693e.getMultiPreviewPlugin().mo160450H(true);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106232j(MultiVideoPluginLayout multiVideoPluginLayout, C106976a.C31054c cVar, boolean z, C15601d<? super C106232j> dVar) {
            super(2, dVar);
            this.f316689e = multiVideoPluginLayout;
            this.f316690f = cVar;
            this.f316691g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106232j(this.f316689e, this.f316690f, this.f316691g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106232j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f316688d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VideoCompositionPlayView videoCompositionPlayView = this.f316689e.getMultiPreviewPlugin().f326970j;
                if (videoCompositionPlayView != null) {
                    videoCompositionPlayView.pause();
                }
                this.f316689e.f316629G.mo152112c(this.f316690f);
                this.f316689e.f316629G.mo152116i(-1);
                C106976a.f320208a.mo157408l(this.f316690f, new long[0]);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C106233a aVar2 = new C106233a(this.f316691g, this.f316689e, (C15601d<? super C106233a>) null);
                this.f316688d = 1;
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

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$m */
    public static final class C106234m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f316694d;

        /* renamed from: e */
        public final /* synthetic */ GalleryItem$MediaItem f316695e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106234m(MultiVideoPluginLayout multiVideoPluginLayout, GalleryItem$MediaItem galleryItem$MediaItem) {
            super(0);
            this.f316694d = multiVideoPluginLayout;
            this.f316695e = galleryItem$MediaItem;
        }

        public Object invoke() {
            MultiVideoPluginLayout multiVideoPluginLayout = this.f316694d;
            String str = this.f316695e.f162747d;
            C87412m.m108593f(str, "originalPath");
            multiVideoPluginLayout.f316625C = str;
            MultiVideoPluginLayout multiVideoPluginLayout2 = this.f316694d;
            String str2 = multiVideoPluginLayout2.f316625C;
            if (multiVideoPluginLayout2.f316660f1 && C106976a.f320217j.containsKey(this.f316695e.f162747d)) {
                Log.m105924i("MicroMsg.MultiVideoPluginLayout", "update select image path to image enhancement result path: " + C106976a.f320217j.get(this.f316695e.f162747d));
                String str3 = C106976a.f320217j.get(this.f316695e.f162747d);
                if (str3 == null) {
                    str3 = this.f316695e.f162747d;
                    C87412m.m108593f(str3, "originalPath");
                }
                str2 = str3;
            }
            C112660e0 D = this.f316694d.f316671s.mo160425D(str2);
            this.f316694d.f316640R.mo84844a(IXWebBroadcastListener.STAGE_START, "get photo view");
            C110351a aVar = this.f316694d.f316670r;
            String str4 = this.f316695e.f162747d;
            C87412m.m108593f(str4, "originalPath");
            aVar.getClass();
            aVar.f330093f.mo152284t(str4);
            C109202j multiPreviewPlugin = this.f316694d.getMultiPreviewPlugin();
            String str5 = this.f316695e.f162747d;
            C87412m.m108593f(str5, "this.originalPath");
            multiPreviewPlugin.mo160449G(D, str5, true);
            Context context = this.f316694d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((ViewGroup) ((Activity) context).getWindow().getDecorView().findViewById(16908290)).setAlpha(1.0f);
            this.f316694d.f316623A.mo86128x();
            this.f316694d.mo152198C();
            MultiVideoPluginLayout multiVideoPluginLayout3 = this.f316694d;
            multiVideoPluginLayout3.setBackgroundColor(multiVideoPluginLayout3.f316659e1);
            MultiVideoPluginLayout multiVideoPluginLayout4 = this.f316694d;
            multiVideoPluginLayout4.setCurrentStyle(multiVideoPluginLayout4.getMultiPreviewPlugin().f326967g.getStyle());
            this.f316694d.f316640R.mo84844a(IXWebBroadcastListener.STAGE_START, "load first image");
            this.f316694d.f316677x0.mo160469x(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$n */
    public static final class C106235n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoPluginLayout f316696d;

        public C106235n(MultiVideoPluginLayout multiVideoPluginLayout) {
            this.f316696d = multiVideoPluginLayout;
        }

        public final void run() {
            ViewParent parent = this.f316696d.f316670r.f330093f.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(this.f316696d.f316670r.f330093f);
            MultiVideoPluginLayout multiVideoPluginLayout = this.f316696d;
            TimeEditorItemContainer timeEditorItemContainer = multiVideoPluginLayout.f316670r.f330093f;
            C109202j multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
            viewGroup.addView(timeEditorItemContainer, multiPreviewPlugin.f326969i.indexOfChild(multiPreviewPlugin.f326966f) + 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$o */
    public static final class C106236o implements C92018l {

        /* renamed from: a */
        public final /* synthetic */ long f316697a;

        /* renamed from: b */
        public final /* synthetic */ C92023q f316698b;

        /* renamed from: c */
        public final /* synthetic */ MultiVideoPluginLayout f316699c;

        public C106236o(long j, C92023q qVar, MultiVideoPluginLayout multiVideoPluginLayout) {
            this.f316697a = j;
            this.f316698b = qVar;
            this.f316699c = multiVideoPluginLayout;
        }

        /* renamed from: a */
        public void mo125916a() {
            C106976a aVar = C106976a.f320208a;
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            effectManager.mo154934n(this.f316697a);
        }

        /* renamed from: b */
        public void mo125917b() {
            C106976a aVar = C106976a.f320208a;
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            effectManager.mo154925e(this.f316697a);
        }

        /* renamed from: c */
        public void mo125918c(float f, float f2, float f3, float f4) {
            C106976a aVar = C106976a.f320208a;
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            C110625c0 l = effectManager.mo154932l(this.f316698b.f263509h);
            C110644t tVar = l instanceof C110644t ? (C110644t) l : null;
            if (tVar != null) {
                tVar.mo162193e(new C110629f((int) f, (int) f2, f3, f4));
            }
            this.f316699c.getMultiPreviewPlugin().mo160443A();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        C87412m.m108594g(context2, "context");
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
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "init MultiVideoPluginLayout");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bh9, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…lugin_layout, this, true)");
        this.f316662h = inflate;
        View findViewById = findViewById(C0966R.C0970id.h3u);
        C87412m.m108593f(findViewById, "findViewById(R.id.multi_…_edit_bottom_func_layout)");
        this.f316645T0 = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activity.getWindow().setSoftInputMode(48);
        C106976a.f320208a.mo157401e((EffectManager) null);
        View findViewById2 = findViewById(C0966R.C0970id.f358786h31);
        C87412m.m108593f(findViewById2, "findViewById(R.id.multi_crop_layout)");
        View findViewById3 = findViewById(C0966R.C0970id.bwp);
        C87412m.m108593f(findViewById3, "findViewById(R.id.crop_ope_layout)");
        setMultiPreviewPlugin(new C109202j((MultiEditCropLayout) findViewById2, (MultiEditCropOperationLayout) findViewById3, this));
        getMultiPreviewPlugin().f326979v = this.f316629G;
        View findViewById4 = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById4, "findViewById(R.id.editor_add_emoji)");
        C99426e eVar = new C99426e(this, (ImageView) findViewById4, this);
        this.f316672t = eVar;
        C30517h0.m39114c();
        C96568a aVar2 = new C96568a(this);
        SparseArray<C97942y> sparseArray = C97944z.f287281a;
        C97595e eVar2 = new C97595e(aVar2);
        SparseArray<C97942y> sparseArray2 = C97944z.f287281a;
        eVar2.mo136858b();
        sparseArray2.put(108, eVar2);
        C107165b bVar = new C107165b();
        HashMap<String, C97940x> hashMap = C97944z.f287282b;
        bVar.mo157592a();
        hashMap.put("pag_panel", bVar);
        View findViewById5 = findViewById(C0966R.C0970id.l5o);
        C87412m.m108593f(findViewById5, "findViewById(R.id.video_editor_item_container)");
        C110351a aVar3 = new C110351a((TimeEditorItemContainer) findViewById5, this);
        this.f316670r = aVar3;
        getMultiPreviewPlugin().mo160452K(aVar3.f330093f);
        View findViewById6 = findViewById(C0966R.C0970id.hvw);
        C87412m.m108593f(findViewById6, "findViewById(R.id.photo_editor_item_container)");
        C109184f0 f0Var = new C109184f0((FrameLayout) findViewById6, this);
        this.f316671s = f0Var;
        View findViewById7 = findViewById(C0966R.C0970id.azh);
        C87412m.m108593f(findViewById7, "findViewById(R.id.change_text_root)");
        C109359m mVar = new C109359m((EditorInputView) findViewById7, this);
        mVar.f327377f.setEnableClickOutsideConfirm(false);
        C109348i iVar = new C109348i(this, this, mVar.f327377f);
        this.f316673u = iVar;
        C108531a aVar4 = new C108531a(this, this);
        this.f316674v = aVar4;
        aVar4.f324878j.setBackground(C0966R.C0969drawable.azc);
        getMultiPreviewPlugin().mo160452K(aVar4);
        C99318r0 r0Var = new C99318r0(this, this);
        this.f316675w = r0Var;
        View findViewById8 = findViewById(C0966R.C0970id.cco);
        C87412m.m108593f(findViewById8, "findViewById(R.id.editor_mix)");
        C99448l lVar = new C99448l(findViewById8, this);
        this.f316676x = lVar;
        View findViewById9 = findViewById(C0966R.C0970id.cc8);
        C87412m.m108593f(findViewById9, "findViewById(R.id.editor_close)");
        C99447k kVar = new C99447k((ImageView) findViewById9, this);
        this.f316678y = kVar;
        View findViewById10 = findViewById(C0966R.C0970id.edc);
        C87412m.m108593f(findViewById10, "findViewById(R.id.footer_preview)");
        C61196g gVar2 = new C61196g((RecyclerView) findViewById10, this);
        this.f316633K = gVar2;
        int h = C76577a.m92157h(context2, C0966R.dimen.f3707bz);
        ViewGroup.LayoutParams layoutParams = gVar2.f174215f.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = h;
        gVar2.f174215f.setLayoutParams(layoutParams2);
        this.f316633K.f174219j = new C96569b(this);
        this.f316634L = new C109168c0(this, this);
        View findViewById11 = findViewById(C0966R.C0970id.cbq);
        C87412m.m108593f(findViewById11, "findViewById(R.id.editor_add_caption_group)");
        View findViewById12 = findViewById(C0966R.C0970id.cc7);
        C87412m.m108593f(findViewById12, "findViewById(R.id.editor_caption_preview_panel)");
        View findViewById13 = findViewById(C0966R.C0970id.cc6);
        C109359m mVar2 = mVar;
        C87412m.m108593f(findViewById13, "findViewById(R.id.editor_caption_edit_panel)");
        C109475c cVar = new C109475c((ViewGroup) findViewById11, (EditorPanelHolder) findViewById12, (EditorPanelHolder) findViewById13, this);
        this.f316680z = cVar;
        getMultiPreviewPlugin().mo160452K(cVar);
        View findViewById14 = findViewById(C0966R.C0970id.i2c);
        C87412m.m108593f(findViewById14, "findViewById(R.id.preview_thumb)");
        C61205o0 o0Var = new C61205o0((ImageView) findViewById14, this);
        this.f316623A = o0Var;
        View findViewById15 = findViewById(C0966R.C0970id.cd4);
        C87412m.m108593f(findViewById15, "findViewById(R.id.editor_tts_panel)");
        C109923a aVar5 = new C109923a((ViewGroup) findViewById15, this);
        this.f316624B = aVar5;
        getMultiPreviewPlugin().mo160452K(aVar5);
        float f = (float) 2;
        float f2 = f;
        float f3 = ((getMultiPreviewPlugin().f326972o.top + getMultiPreviewPlugin().f326972o.bottom) / f) - ((float) (C75054z4.m90003a(context).y / 2));
        Log.m105924i("MicroMsg.ThumbLoadingPlugin", "setTranslateY " + f3);
        o0Var.f174240f.setTranslationY(f3);
        this.f316629G.getClass();
        this.f316635M = new C109232t0(this, this);
        C109154a aVar6 = new C109154a(this, this);
        this.f316637P = aVar6;
        View findViewById16 = findViewById(C0966R.C0970id.f357902cd0);
        C109923a aVar7 = aVar5;
        C87412m.m108593f(findViewById16, "findViewById(R.id.editor_track_edit_panel)");
        C109235u0 u0Var = new C109235u0((EditorPanelHolder) findViewById16, this);
        this.f316636N = u0Var;
        View findViewById17 = findViewById(C0966R.C0970id.ccz);
        C61205o0 o0Var2 = o0Var;
        C87412m.m108593f(findViewById17, "findViewById(R.id.editor_time_edit_panel)");
        C110130b bVar2 = new C110130b((EditorPanelHolder) findViewById17, this);
        this.f316638Q = bVar2;
        EditorPanelHolder editorPanelHolder = new EditorPanelHolder(context2);
        addView(editorPanelHolder, -1, -1);
        editorPanelHolder.setVisibility(8);
        C109219q0 q0Var = new C109219q0(editorPanelHolder, this);
        this.f316648V = q0Var;
        C99324x xVar = new C99324x(this, this);
        this.f316642S = xVar;
        C109219q0 q0Var2 = q0Var;
        C99324x xVar2 = xVar;
        C99327z zVar = new C99327z(this, this, this.f316629G, getMultiPreviewPlugin());
        this.f316644T = zVar;
        this.f316646U = new C109165b0(this, this);
        this.f316650W = new C110496a(this, this, true);
        C109213j0 j0Var = new C109213j0(this, this);
        this.f316668p0 = j0Var;
        C109190g0 g0Var = new C109190g0(this, this);
        this.f316643S0 = g0Var;
        g0Var.mo160431x(aVar3);
        g0Var.mo160431x(aVar6);
        C109190g0 g0Var2 = g0Var;
        C109217n0 n0Var = new C109217n0(this, this);
        this.f316677x0 = n0Var;
        C109217n0 n0Var2 = n0Var;
        C99306m0 m0Var = new C99306m0(this, this);
        this.f316679y0 = m0Var;
        C99306m0 m0Var2 = m0Var;
        C109201i0 i0Var = new C109201i0(this, this);
        this.f316639Q0 = i0Var;
        C109201i0 i0Var2 = i0Var;
        C109245y0 y0Var = new C109245y0(this, this);
        this.f316641R0 = y0Var;
        getMultiPreviewPlugin().mo160452K(aVar6);
        getMultiPreviewPlugin().mo160452K(u0Var);
        getMultiPreviewPlugin().mo160452K(bVar2);
        C109213j0 j0Var2 = j0Var;
        getMultiPreviewPlugin().f326967g.setOutsideTouckListener(new C106226c(this));
        View findViewById18 = findViewById(C0966R.C0970id.h3v);
        C87412m.m108593f(findViewById18, "findViewById(R.id.multi_video_edit_head)");
        this.f316647U0 = findViewById18;
        getPluginList().add(aVar6);
        getPluginList().add(u0Var);
        getPluginList().add(bVar2);
        getPluginList().add(eVar);
        getPluginList().add(aVar3);
        getPluginList().add(f0Var);
        getPluginList().add(iVar);
        getPluginList().add(aVar4);
        getPluginList().add(r0Var);
        getPluginList().add(lVar);
        getPluginList().add(kVar);
        getPluginList().add(cVar);
        getPluginList().add(this.f316635M);
        getPluginList().add(getMultiPreviewPlugin());
        getPluginList().add(this.f316633K);
        getPluginList().add(this.f316640R);
        getPluginList().add(o0Var2);
        getPluginList().add(xVar2);
        getPluginList().add(zVar);
        getPluginList().add(q0Var2);
        getPluginList().add(this.f316634L);
        getPluginList().add(j0Var2);
        getPluginList().add(aVar7);
        getPluginList().add(n0Var2);
        getPluginList().add(m0Var2);
        getPluginList().add(i0Var2);
        getPluginList().add(y0Var);
        getPluginList().add(g0Var2);
        int i = C60287a.f171907b;
        int i2 = C60287a.f171906a;
        float f4 = (float) i;
        float f5 = (float) i2;
        float f6 = f4 / f5;
        float f7 = f4 / 2.18f;
        float f8 = (f5 - f7) / f2;
        float f9 = (f4 - f4) / f2;
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "initSafeArea, displaySize:[" + i2 + ", " + i + "], scale:" + f6 + ", safeAreaWidth:" + f7 + ", safeAreaFrameWidth:" + f8 + ", safeAreaHeight:" + f4 + ", safeAreaFrameHeight:" + f9);
        if (f6 <= 1.78f) {
            mVar2.mo160552y(f7, f8);
            aVar3.mo161852J(f7, f8);
            return;
        }
        C109359m mVar3 = mVar2;
        if (f6 >= 2.18f) {
            mVar3.mo160551x(f7, f8);
            aVar3.mo161851I(f4, f9);
            return;
        }
        mVar3.mo160552y(f7, f8);
        mVar3.mo160551x(f7, f8);
        aVar3.mo161852J(f7, f8);
        aVar3.mo161851I(f4, f9);
    }

    private final void setupTemplateVideoPlugins(C106976a.C31054c cVar) {
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "setupTemplateVideoPlugins, template:" + cVar);
        this.f316639Q0.setVisibility(4);
        this.f316679y0.setVisibility(0);
        this.f316633K.setVisibility(8);
        this.f316646U.setVisibility(8);
        this.f316674v.onPause();
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "showTemplateEditPlugins");
        this.f316674v.setVisibility(8);
        this.f316675w.setVisibility(8);
        this.f316635M.setVisibility(8);
        this.f316642S.setVisibility(8);
        this.f316644T.setVisibility(8);
        this.f316633K.setVisibility(8);
        this.f316634L.setVisibility(8);
        this.f316671s.setVisibility(8);
        this.f316680z.setVisibility(8);
        this.f316673u.setVisibility(8);
        this.f316672t.setVisibility(8);
        this.f316641R0.getClass();
        C106976a aVar = C106976a.f320208a;
        this.f316670r.f330093f.setVisibility(4);
        this.f316670r.mo161856N(true);
        boolean z = this.f316649V0;
        this.f316649V0 = true;
        setBackgroundColor(this.f316659e1);
        MultiEditCropOperationLayout multiEditCropOperationLayout = getMultiPreviewPlugin().f326967g;
        WxCropOperationLayout.C94436h hVar = WxCropOperationLayout.C94436h.RECT_LINE_HARD;
        multiEditCropOperationLayout.setStyle(hVar);
        this.f316655a1 = hVar;
        VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.setVisibility(0);
        }
        this.f316629G.f316436r = this.f316664j;
        RectF rectF = getMultiPreviewPlugin().f326972o;
        rectF.round(C103020m.f303988d);
        getMultiPreviewPlugin().mo160456O(rectF);
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C106232j(this, cVar, z, (C15601d<? super C106232j>) null), 2, (Object) null);
    }

    /* renamed from: t */
    public static /* synthetic */ void m142943t(MultiVideoPluginLayout multiVideoPluginLayout, boolean z, boolean z2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                j = -1;
            }
            multiVideoPluginLayout.mo152207r(z, z2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recreateVideo");
    }

    /* renamed from: z */
    public static void m142944z(MultiVideoPluginLayout multiVideoPluginLayout, boolean z, boolean z2, long j, int i, Object obj) {
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
            if (!multiVideoPluginLayout.f316629G.f316429h || multiVideoPluginLayout.f316649V0) {
                if (z) {
                    multiVideoPluginLayout.mo152207r(true, z2, j);
                } else {
                    if (j != -1) {
                        multiVideoPluginLayout.getMultiPreviewPlugin().mo160453L(j);
                    }
                    C109202j multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
                    VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f326970j;
                    if (videoCompositionPlayView != null) {
                        videoCompositionPlayView.mo154761h();
                    }
                    C106206s sVar = multiPreviewPlugin.f326964I;
                    sVar.f316503b = 0;
                    sVar.f316502a = 0;
                    multiPreviewPlugin.f326965J = 0;
                    C109202j.C99301e eVar = multiVideoPluginLayout.getMultiPreviewPlugin().f326959D;
                    if (eVar != null) {
                        eVar.resume();
                    }
                }
            }
            multiVideoPluginLayout.f316643S0.mo160429A();
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeVideo");
    }

    /* renamed from: A */
    public final void mo152196A() {
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "setupNormalVideoPlugins");
        this.f316629G.mo152128z();
        getMultiPreviewPlugin().mo160456O(this.f316629G.f316434p);
        this.f316639Q0.setVisibility(0);
        this.f316679y0.setVisibility(8);
        mo152199D();
        this.f316670r.f330093f.setVisibility(0);
        this.f316670r.mo161856N(true);
        this.f316635M.f327035h.f317010K = false;
        this.f316649V0 = false;
        this.f316629G.f316436r = this.f316664j;
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C106230i(this, (C15601d<? super C106230i>) null), 2, (Object) null);
    }

    /* renamed from: B */
    public final void mo152197B() {
        ArrayList<String> arrayList;
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "showImageEditPlugins");
        this.f316633K.setVisibility(0);
        this.f316634L.setVisibility(0);
        this.f316671s.setVisibility(0);
        C98324b bVar = this.f316628F;
        if (!(bVar == null || (arrayList = bVar.f288190k) == null)) {
            arrayList.add(this.f316654Z0.get(0).f162747d);
        }
        this.f316675w.setVisibility(8);
        this.f316635M.setVisibility(8);
        this.f316642S.setVisibility(8);
        this.f316644T.setVisibility(8);
        this.f316680z.setVisibility(8);
        this.f316673u.setVisibility(0);
        this.f316672t.setVisibility(0);
        this.f316641R0.getClass();
        C106976a aVar = C106976a.f320208a;
        if (!C30517h0.m39113b() || this.f316631I) {
            this.f316674v.setVisibility(8);
        } else {
            this.f316674v.setVisibility(0);
        }
    }

    /* renamed from: C */
    public final void mo152198C() {
        View view = this.f316647U0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!this.f316649V0) {
            this.f316641R0.getClass();
            C106976a aVar2 = C106976a.f320208a;
        }
        if (this.f316629G.f316429h && !this.f316649V0) {
            this.f316633K.setVisibility(0);
        }
        getMultiPreviewPlugin().f326967g.setStyle(this.f316655a1);
        if (!this.f316629G.f316429h) {
            this.f316635M.setVisibility(0);
        } else if (C30517h0.m39113b() && !this.f316631I) {
            this.f316674v.setVisibility(0);
        }
        if (C106227d.f316682a[this.f316658d1.ordinal()] == 1) {
            this.f316646U.setVisibility(0);
            this.f316635M.setVisibility(0);
            return;
        }
        View view2 = this.f316645T0;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: D */
    public final void mo152199D() {
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "showVideoEditPlugins");
        this.f316674v.setVisibility(0);
        this.f316675w.setVisibility(0);
        this.f316635M.setVisibility(0);
        this.f316642S.setVisibility(0);
        this.f316644T.setVisibility(0);
        this.f316633K.setVisibility(8);
        this.f316634L.setVisibility(8);
        this.f316671s.setVisibility(8);
        this.f316680z.setVisibility(0);
        this.f316673u.setVisibility(0);
        this.f316672t.setVisibility(0);
        this.f316641R0.getClass();
        C106976a aVar = C106976a.f320208a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
        r9 = r9.f272912M;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152200E() {
        /*
            r22 = this;
            r0 = r22
            com.tencent.mm.plugin.vlog.model.FinderVideoShell r1 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82198a
            java.lang.String r1 = "MicroMsg.FinderVideoShell"
            java.lang.String r2 = "markPressEditFinish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            long r1 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82206i
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0019
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82206i = r1
        L_0x0019:
            l23.o0 r1 = r0.f316623A
            r2 = 2
            r5 = 0
            r6 = 2131838435(0x7f1145e3, float:1.9310093E38)
            r7 = 0
            r1.mo86129y(r6, r7)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f316627E
            gy3.C87412m.m108591d(r1)
            java.lang.String r10 = r1.f272901B
            th2.c r1 = r0.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r1 = r1.f332424a
            r8 = 2
            r1.f310230t = r8
            r22.mo152211w()
            i23.a r11 = i23.C8847a.f28097a
            r12 = 101(0x65, float:1.42E-43)
            r13 = 1
            long r8 = java.lang.System.currentTimeMillis()
            long r14 = r0.f316661g1
            long r14 = r8 - r14
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 112(0x70, float:1.57E-43)
            r21 = 0
            i23.C8847a.m8677a(r11, r12, r13, r14, r16, r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$l r1 = new com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$l
            r1.<init>(r0, r10)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r6 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r6 = r6.f272892b
            java.lang.String r8 = "SOUND_TRACK_TYPE"
            r6.putInt(r8, r7)
            j23.a r6 = r0.f316674v
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r6 = r6.f324881p
            r15 = 1
            if (r6 == 0) goto L_0x00e9
            boolean r9 = r6.f163824s
            if (r9 == 0) goto L_0x00d1
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r6 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r6 = r6.f272892b
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r0.f316627E
            if (r9 == 0) goto L_0x007e
            android.os.Bundle r9 = r9.f272912M
            if (r9 == 0) goto L_0x007e
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_ID"
            java.lang.String r9 = r9.getString(r11)
            goto L_0x007f
        L_0x007e:
            r9 = r5
        L_0x007f:
            java.lang.String r11 = "ORIGIN_MUSIC_ID"
            r6.putString(r11, r9)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r6 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r6 = r6.f272892b
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r0.f316627E
            if (r9 == 0) goto L_0x0097
            android.os.Bundle r9 = r9.f272912M
            if (r9 == 0) goto L_0x0097
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r9 = r9.getString(r11)
            goto L_0x0098
        L_0x0097:
            r9 = r5
        L_0x0098:
            java.lang.String r11 = "ORIGIN_MUSIC_PATH"
            r6.putString(r11, r9)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r6 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r6 = r6.f272892b
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r0.f316627E
            if (r9 == 0) goto L_0x00b0
            android.os.Bundle r9 = r9.f272912M
            if (r9 == 0) goto L_0x00b0
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_INFO"
            byte[] r9 = r9.getByteArray(r11)
            goto L_0x00b1
        L_0x00b0:
            r9 = r5
        L_0x00b1:
            java.lang.String r11 = "ORIGIN_MUSIC_INFO"
            r6.putByteArray(r11, r9)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r0.f316627E
            if (r6 == 0) goto L_0x00c5
            android.os.Bundle r6 = r6.f272912M
            if (r6 == 0) goto L_0x00c5
            java.lang.String r9 = "KEY_BGM_IF_ORIGIN"
            boolean r6 = r6.getBoolean(r9)
            goto L_0x00c6
        L_0x00c5:
            r6 = 0
        L_0x00c6:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r9 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r9 = r9.f272892b
            if (r6 == 0) goto L_0x00cd
            r2 = 1
        L_0x00cd:
            r9.putInt(r8, r2)
            goto L_0x00e9
        L_0x00d1:
            te3.xt2 r2 = r6.f163812d
            byte[] r2 = r2.toByteArray()
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r9 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r9 = r9.f272892b
            java.lang.String r11 = "MEDIA_EXTRA_MUSIC"
            r9.putByteArray(r11, r2)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            int r6 = r6.f163821p
            r2.putInt(r8, r6)
        L_0x00e9:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r0.f316627E
            if (r6 == 0) goto L_0x00fc
            android.os.Bundle r6 = r6.f272912M
            if (r6 == 0) goto L_0x00fc
            java.lang.String r8 = "KEY_ORIGIN_BGM_URL"
            java.lang.String r6 = r6.getString(r8)
            goto L_0x00fd
        L_0x00fc:
            r6 = r5
        L_0x00fd:
            java.lang.String r8 = "ORIGIN_BGM_URL"
            r2.putString(r8, r6)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            j23.a r6 = r0.f316674v
            boolean r6 = r6.mo159392z()
            if (r6 != 0) goto L_0x0115
            boolean r6 = r0.f316630H
            if (r6 == 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r6 = 0
            goto L_0x0116
        L_0x0115:
            r6 = 1
        L_0x0116:
            java.lang.String r8 = "MEDIA_IS_MUTE"
            r2.putBoolean(r8, r6)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r2 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r2 = r2.f272892b
            j23.a r6 = r0.f316674v
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r6 = r6.f324878j
            boolean r6 = r6.getWithMusic()
            r6 = r6 ^ r15
            java.lang.String r8 = "MUSIC_IS_MUTE"
            r2.putBoolean(r8, r6)
            com.tencent.mm.plugin.vlog.model.f0 r2 = r0.f316629G
            boolean r2 = r2.f316429h
            if (r2 == 0) goto L_0x018e
            l23.n0 r2 = r0.f316677x0
            com.google.android.material.tabs.TabLayout r2 = r2.f327005h
            int r2 = r2.getSelectedTabPosition()
            if (r2 != r15) goto L_0x013f
            r2 = 1
            goto L_0x0140
        L_0x013f:
            r2 = 0
        L_0x0140:
            if (r2 != 0) goto L_0x018e
            ds.m$a r1 = new ds.m$a
            r1.<init>()
            java.lang.String r2 = r0.f316669q
            r1.mo8636a(r2)
            int r2 = r0.f316666o
            r1.f25769d = r2
            int r2 = r0.f316665n
            r1.f25770e = r2
            r2 = 100
            r1.f25771f = r2
            lw1.b$d r2 = new lw1.b$d
            r2.<init>(r1)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r0.f316629G
            java.util.LinkedList<java.lang.String> r1 = r1.f316425d
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r5 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            th2.d r3 = th2.C110992d.f332425a
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r14 = r3.mo162676j()
            java.lang.String r11 = ""
            r8 = r5
            r9 = r13
            r8.<init>(r9, r10, r11, r12, r13, r14)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r3 = r3.mo162676j()
            r4.mo129797d(r15, r3)
            r3 = 1
            r0.mo152212x(r3)
            r0.mo152204n(r2, r1, r5, r7)
            goto L_0x01a5
        L_0x018e:
            r22.mo152206q()
            j23.a r2 = r0.f316674v
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r2 = r2.f324881p
            if (r2 == 0) goto L_0x01a2
            jh2.m r3 = jh2.C60863m.f173404c
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$k r4 = new com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$k
            r4.<init>(r0, r1)
            r3.mo85769c(r2, r4)
            goto L_0x01a5
        L_0x01a2:
            r0.mo152203m(r5, r1)
        L_0x01a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout.mo152200E():void");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!super.mo78564e()) {
            VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f326970j;
            if (videoCompositionPlayView != null) {
                videoCompositionPlayView.stop();
            }
            C102440a aVar = this.f316663i;
            if (aVar != null) {
                C102440a.C102441a.m135179a(aVar, 0, (C98324b) null, 2, (Object) null);
            }
        }
        C8847a.m8677a(C8847a.f28097a, 101, 1, System.currentTimeMillis() - this.f316661g1, 0, (JSONObject) null, (String) null, (C49712hj1) null, 112, (Object) null);
        this.f316656b1.f332424a.f310230t = 1;
        mo152211w();
        if (this.f316629G.f316429h) {
            if (!(this.f316677x0.f327005h.getSelectedTabPosition() == 1)) {
                mo152212x(0);
                CaptureDataManager.f272890c.mo129797d(false, C110992d.f332425a.mo162676j());
                return true;
            }
        }
        C61926c.m72657B("MultiVideoPluginLayout_report", true, new C98900g(this, 0));
        CaptureDataManager.f272890c.mo129797d(false, C110992d.f332425a.mo162676j());
        return true;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final WxCropOperationLayout.C94436h getCurrentStyle() {
        return this.f316655a1;
    }

    public final C109202j getMultiPreviewPlugin() {
        C109202j jVar = this.f316632J;
        if (jVar != null) {
            return jVar;
        }
        C87412m.m108603p("multiPreviewPlugin");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0181 A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128671k(wg2.C102440a r7, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r8) {
        /*
            r6 = this;
            java.lang.String r0 = "navigator"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "configProvider"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initLogic ,configProvider:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MultiVideoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r6.f316663i = r7
            r6.f316627E = r8
            l23.j r7 = r6.getMultiPreviewPlugin()
            com.tencent.mm.modelcontrol.VideoTransPara r0 = r8.f272926n
            if (r0 == 0) goto L_0x002f
            int r0 = r0.f267168f
            goto L_0x0030
        L_0x002f:
            r0 = -1
        L_0x0030:
            r7.f326963H = r0
            hi2.h r7 = hi2.C98453h.f288774a
            r7.mo137806d(r8)
            q23.a r7 = r6.f316670r
            r7.getClass()
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r7 = r7.f330093f
            r7.getClass()
            r7.f316774j = r8
            l23.r0 r7 = r6.f316675w
            r0 = 8
            r7.setVisibility(r0)
            lh2.l r7 = r6.f316676x
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r8.f272927o
            r2 = 0
            if (r1 == 0) goto L_0x0058
            int r1 = r1.f266576i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r8.f272927o
            if (r3 == 0) goto L_0x0064
            int r3 = r3.f266577j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0065
        L_0x0064:
            r3 = r2
        L_0x0065:
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r8.f272927o
            if (r4 == 0) goto L_0x006c
            java.lang.String r5 = r4.f266579o
            goto L_0x006d
        L_0x006c:
            r5 = r2
        L_0x006d:
            if (r4 == 0) goto L_0x0076
            int r4 = r4.f266578n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0077
        L_0x0076:
            r4 = r2
        L_0x0077:
            r7.mo138884a(r1, r3, r5, r4)
            j23.a r7 = r6.f316674v
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r8.f272927o
            if (r1 == 0) goto L_0x0087
            int r1 = r1.f266576i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0088
        L_0x0087:
            r1 = r2
        L_0x0088:
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r8.f272927o
            if (r3 == 0) goto L_0x0093
            int r3 = r3.f266577j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0094
        L_0x0093:
            r3 = r2
        L_0x0094:
            r4 = 2131756834(0x7f100722, float:1.9144587E38)
            r7.mo159383C(r1, r3, r2, r4)
            lh2.i r7 = r6.f316673u
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r8.f272927o
            if (r1 == 0) goto L_0x00a7
            int r1 = r1.f266576i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00a8
        L_0x00a7:
            r1 = r2
        L_0x00a8:
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r8.f272927o
            if (r3 == 0) goto L_0x00b2
            int r2 = r3.f266577j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00b2:
            r7.mo160547y(r1, r2)
            lh2.i r7 = r6.f316673u
            r1 = 1
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView r7 = r7.f327359g
            r7.mo151438h(r1)
            android.content.Context r7 = r6.getContext()
            r2 = 2131101711(0x7f06080f, float:1.781584E38)
            int r7 = kg3.C76577a.m92153d(r7, r2)
            lh2.e r2 = r6.f316672t
            android.widget.ImageView r2 = r2.f291517f
            android.content.Context r3 = r2.getContext()
            r4 = 2131756168(0x7f100488, float:1.9143236E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r7)
            r2.setImageDrawable(r3)
            lh2.i r2 = r6.f316673u
            android.widget.ImageView r3 = r2.f327360h
            android.view.ViewGroup r2 = r2.f327358f
            android.content.Context r2 = r2.getContext()
            r4 = 2131756173(0x7f10048d, float:1.9143246E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r4, r7)
            r3.setImageDrawable(r2)
            l23.x r2 = r6.f316642S
            android.widget.ImageView r3 = r2.f291241g
            android.view.ViewGroup r2 = r2.f291240f
            android.content.Context r2 = r2.getContext()
            r4 = 2131756153(0x7f100479, float:1.9143205E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r4, r7)
            r3.setImageDrawable(r2)
            j23.a r2 = r6.f316674v
            android.widget.ImageView r3 = r2.f324875g
            android.view.ViewGroup r2 = r2.f324874f
            android.content.Context r2 = r2.getContext()
            r4 = 2131756160(0x7f100480, float:1.914322E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r4, r7)
            r3.setImageDrawable(r2)
            m23.c r2 = r6.f316680z
            android.widget.ImageView r3 = r2.f327688n
            android.content.Context r2 = r2.f327686i
            r4 = 2131755975(0x7f1003c7, float:1.9142844E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r4, r7)
            r3.setImageDrawable(r2)
            l23.c0 r2 = r6.f316634L
            r2.f326867i = r7
            android.widget.ImageView r2 = r2.f326866h
            android.content.Context r3 = r2.getContext()
            r4 = 2131756017(0x7f1003f1, float:1.914293E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r7)
            r2.setImageDrawable(r3)
            lh2.k r2 = r6.f316678y
            r2.mo138883x(r7)
            l23.j r7 = r6.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$g r2 = new com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$g
            r2.<init>(r6)
            r7.f326975r = r2
            java.util.ArrayList r7 = r6.getPluginList()
            java.util.Iterator r7 = r7.iterator()
        L_0x0152:
            boolean r2 = r7.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0185
            java.lang.Object r2 = r7.next()
            lh2.g0 r2 = (lh2.C109344g0) r2
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r8.f272927o
            if (r4 == 0) goto L_0x017a
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r4.f266575h
            if (r4 == 0) goto L_0x017a
            java.lang.String r5 = r2.name()
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x017a
            boolean r4 = r4.booleanValue()
            goto L_0x017b
        L_0x017a:
            r4 = 0
        L_0x017b:
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r3 = 8
        L_0x0181:
            r2.setVisibility(r3)
            goto L_0x0152
        L_0x0185:
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$h r7 = new com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$h
            r7.<init>(r6)
            l23.t0 r8 = r6.f316635M
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r8 = r8.f327035h
            r8.setAudioSeekable(r7)
            l23.j r8 = r6.getMultiPreviewPlugin()
            r8.f326959D = r7
            l23.u0 r8 = r6.f316636N
            l23.j r0 = r6.getMultiPreviewPlugin()
            l23.j$e r0 = r0.f326958C
            r8.f327057x = r0
            r8.f327058y = r7
            l23.a r7 = r6.f316637P
            l23.j r8 = r6.getMultiPreviewPlugin()
            l23.j$e r8 = r8.f326958C
            r7.getClass()
            l23.t0 r7 = r6.f316635M
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r7 = r7.f327035h
            r7.f317010K = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout.mo128671k(wg2.a, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0107  */
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
            java.lang.String r3 = "MicroMsg.MultiVideoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f316661g1 = r4
            i23.a r6 = i23.C8847a.f28097a
            r7 = 101(0x65, float:1.42E-43)
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            i23.C8847a.m8677a(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
            super.mo129855l(r19)
            hi2.q r2 = r0.f316640R
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r2.f171023d
            java.lang.String r5 = "start"
            r2.put(r5, r4)
            r0.f316628F = r1
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f316654Z0
            r2.clear()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r0.f316627E
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0129
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x0129
            java.lang.Class<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r2.setClassLoader(r6)
            java.lang.String r6 = "media_list"
            java.util.ArrayList r6 = r2.getParcelableArrayList(r6)
            if (r6 == 0) goto L_0x0090
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "loadMediaList:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r0.f316654Z0
            r7.addAll(r6)
        L_0x0090:
            java.lang.String r6 = "KEY_DISABLE_IMAGE_ADD_MUSIC"
            boolean r6 = r2.getBoolean(r6, r4)
            r0.f316631I = r6
            java.lang.String r6 = "KEY_DISABLE_VIDEO_ENHANCEMENT"
            r2.getBoolean(r6, r4)
            l23.y0 r2 = r0.f316641R0
            r2.getClass()
            d23.a r6 = d23.C106976a.f320208a
            android.widget.RelativeLayout r2 = r2.f327073i
            r6 = 8
            r2.setVisibility(r6)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f316654Z0
            boolean r6 = r2 instanceof java.util.Collection
            if (r6 == 0) goto L_0x00b8
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00b8
            goto L_0x00d5
        L_0x00b8:
            java.util.Iterator r2 = r2.iterator()
        L_0x00bc:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00d5
            java.lang.Object r6 = r2.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r6
            int r6 = r6.getType()
            if (r6 != r5) goto L_0x00d0
            r6 = 1
            goto L_0x00d1
        L_0x00d0:
            r6 = 0
        L_0x00d1:
            if (r6 != 0) goto L_0x00bc
            r2 = 0
            goto L_0x00d6
        L_0x00d5:
            r2 = 1
        L_0x00d6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "loadMediaList isAllImage:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            if (r2 == 0) goto L_0x0107
            l23.g r2 = r0.f316633K
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r0.f316654Z0
            r2.mo86112z(r3)
            r18.mo152197B()
            q23.a r2 = r0.f316670r
            r2.mo161844B(r4)
            q23.a r2 = r0.f316670r
            r2.mo161856N(r5)
            l23.i0 r2 = r0.f316639Q0
            android.view.View r3 = r2.f326953g
            r2.f326955i = r3
            goto L_0x0114
        L_0x0107:
            r18.mo152199D()
            q23.a r2 = r0.f316670r
            r2.mo161856N(r5)
            l23.i0 r2 = r0.f316639Q0
            r2.mo160442x()
        L_0x0114:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f316654Z0
            java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
            r7 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r7
            r18.mo152205o()
            l23.o0 r6 = r0.f316623A
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            l23.C61205o0.m71752z(r6, r7, r8, r9, r10, r11)
        L_0x0129:
            a14.s1 r12 = a14.C0001s1.f0d
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            r14 = 0
            j23.h r15 = new j23.h
            r2 = 0
            r15.<init>(r0, r2)
            r16 = 2
            r17 = 0
            a14.C53895h.m60466d(r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x014d
            l23.f0 r2 = r0.f316671s
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f316627E
            gy3.C87412m.m108591d(r3)
            r2.getClass()
            r2.f326908h = r3
            r2.f326909i = r1
        L_0x014d:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            th2.d r3 = th2.C110992d.f332425a
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            java.lang.String r7 = "KEY_ENTER_EDIT_PAGE_TIME_MS_LONG"
            r3.mo162677k(r7, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            f40.e r6 = f40.C86709a0.m107523b()
            java.lang.String r6 = r6.mo121111i()
            r3.append(r6)
            r6 = 95
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.f316653Y0 = r1
            th2.c r2 = r0.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r2 = r2.f332424a
            java.lang.String r3 = "EditId"
            java.lang.String r1 = r2.mo86045b(r3, r1, r5)
            r2.f310215e = r1
            l23.t0 r1 = r0.f316635M
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r1 = r1.f327035h
            r1.setScrollCount(r4)
            l23.j r1 = r18.getMultiPreviewPlugin()
            r1.f326980w = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout.mo129855l(h90.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010c, code lost:
        if (r4 != false) goto L_0x010e;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152203m(java.lang.String r17, fy3.C32228q<? super java.lang.Boolean, ? super te3.C64899zy, ? super android.graphics.Bitmap, rx3.C13598b0> r18) {
        /*
            r16 = this;
            r12 = r16
            r0 = r17
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r12.f316627E
            gy3.C87412m.m108591d(r1)
            java.lang.String r5 = r1.f272901B
            gy3.f0 r9 = new gy3.f0
            r9.<init>()
            q23.a r1 = r12.f316670r
            float[] r1 = r1.mo161850H()
            r9.f27484d = r1
            q23.a r1 = r12.f316670r
            java.util.ArrayList r2 = r1.mo161846D()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "exportVideo, editData:"
            r1.append(r3)
            int r3 = r2.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.MultiVideoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            gy3.a0 r10 = new gy3.a0
            r10.<init>()
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
            if (r6 == 0) goto L_0x005e
            r1 = 0
            goto L_0x0078
        L_0x005e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x006a
            r1 = 1
            goto L_0x0078
        L_0x006a:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_finder_remux_background
            boolean r1 = r1.mo58784wf(r6, r13)
        L_0x0078:
            r10.f27482d = r1
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r12.f316627E
            if (r1 == 0) goto L_0x0087
            java.lang.Boolean r1 = r1.f272933u
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            if (r1 == 0) goto L_0x008c
            r10.f27482d = r4
        L_0x008c:
            com.tencent.mm.plugin.vlog.model.f0 r1 = r12.f316629G
            r1.getClass()
            android.util.Size r6 = new android.util.Size
            int r7 = r1.f316431j
            int r1 = r1.f316432n
            r6.<init>(r7, r1)
            android.graphics.Rect r7 = new android.graphics.Rect
            l23.j r1 = r16.getMultiPreviewPlugin()
            android.graphics.Rect r1 = r1.mo160444B()
            r7.<init>(r1)
            com.tencent.mm.plugin.vlog.model.p0 r8 = new com.tencent.mm.plugin.vlog.model.p0
            com.tencent.mm.plugin.vlog.model.f0 r1 = r12.f316629G
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
            boolean r11 = r10.f27482d
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r0 == 0) goto L_0x00d8
            r8.mo134608e(r0, r13)
        L_0x00d8:
            j23.a r1 = r12.f316674v
            boolean r1 = r1.mo159392z()
            r1 = r1 ^ r13
            r8.mo81185d(r1)
            l23.y0 r1 = r12.f316641R0
            r1.getClass()
            r8.f282576i = r4
            com.tencent.mm.plugin.vlog.model.i r11 = new com.tencent.mm.plugin.vlog.model.i
            r11.<init>(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 == 0) goto L_0x010e
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r13
            if (r0 != 0) goto L_0x010e
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r0 = r8.f282570c
            int r0 = r0.size()
            if (r0 > r13) goto L_0x010e
            h90.b r0 = r12.f316628F
            if (r0 == 0) goto L_0x010c
            boolean r0 = r0.f288182c
            if (r0 != r13) goto L_0x010c
            r4 = 1
        L_0x010c:
            if (r4 == 0) goto L_0x0110
        L_0x010e:
            r12.f316657c1 = r13
        L_0x0110:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            l23.j r0 = r16.getMultiPreviewPlugin()
            android.graphics.RectF r0 = r0.f326972o
            r0.round(r14)
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$e r15 = new com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout$e
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout.mo152203m(java.lang.String, fy3.q):void");
    }

    /* renamed from: n */
    public final void mo152204n(C99685b.C99690d dVar, String[] strArr, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, int i) {
        C8479f0 f0Var = new C8479f0();
        T t = this.f316629G.f316425d.get(i);
        C87412m.m108593f(t, "multiMedia.pathList[index]");
        f0Var.f27484d = t;
        if (this.f316660f1) {
            C106976a aVar = C106976a.f320208a;
            if (C106976a.f320217j.containsKey(t)) {
                T t2 = (String) C106976a.f320217j.get(f0Var.f27484d);
                if (t2 == null) {
                    t2 = "";
                }
                if (C86013q1.m106450k(t2)) {
                    Log.m105924i("MicroMsg.MultiVideoPluginLayout", "generateCropImage enable enhancement, use enhancement result image path:" + t2);
                    f0Var.f27484d = t2;
                }
            }
        }
        this.f316671s.mo160422A((String) f0Var.f27484d, new C96571f(f0Var, i, this, dVar, strArr, captureVideoNormalModel));
    }

    /* renamed from: o */
    public final void mo152205o() {
        this.f316677x0.setVisibility(4);
        this.f316641R0.getClass();
        C106976a aVar = C106976a.f320208a;
        View view = this.f316645T0;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(4);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f316647U0;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(4);
        View view3 = view2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getMultiPreviewPlugin().f326967g.setStyle(WxCropOperationLayout.C94436h.RECT_HARD);
        this.f316633K.setVisibility(4);
        if (C106227d.f316682a[this.f316658d1.ordinal()] == 1) {
            this.f316646U.setVisibility(4);
            this.f316650W.setVisibility(0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024 && i2 == -1) {
            getMultiPreviewPlugin().mo160443A();
            C106195f0 f0Var = this.f316629G;
            if (f0Var.f316429h) {
                C106976a.f320208a.mo157404h(f0Var.f316425d);
                C61196g gVar = this.f316633K;
                gVar.mo86111y(gVar.mo86110x());
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "onDetach");
        C109202j multiPreviewPlugin = getMultiPreviewPlugin();
        VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.mo154756f();
            multiPreviewPlugin.f326970j = null;
        }
        View view = this.f316662h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C106976a.f320208a.mo157403g();
        this.f316641R0.f327077p.getClass();
        Log.m105924i("MicroMsg.CompositionLabelRetriever", "cancel get label");
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        GalleryItem$MediaItem galleryItem$MediaItem;
        C104380d d;
        EmojiInfo emojiInfo;
        int i;
        C110625c0 c0Var;
        Size size;
        String obj;
        C101198e.C101199b bVar2 = bVar;
        Bundle bundle2 = bundle;
        C92011d dVar = C92011d.CAPTION;
        C92011d dVar2 = C92011d.RECORD_CAPTION;
        C108536c cVar = C108536c.SINGLE_EDIT;
        C108536c cVar2 = C108536c.GLOBAL_EDIT;
        C87412m.m108594g(bVar2, "status");
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "statusChange " + bVar2 + "  param:" + bundle2);
        int ordinal = bVar.ordinal();
        if (ordinal == 19) {
            String str = "";
            if (bundle2 != null) {
                bundle2.getInt("EDIT_FILTER_INDEX_INT", -1);
                float f = bundle2.getFloat("EDIT_FILTER_COLOR_WEIGHT_FLOAT", 0.0f);
                String string = bundle2.getString("EDIT_FILTER_COLOR_PATH_STRING");
                C96552p0 z = getMultiPreviewPlugin().mo160462z();
                if (z != null) {
                    z.mo134624u(string == null ? str : string, f);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        } else if (ordinal == 29) {
            mo78564e();
            C13598b0 b0Var2 = C13598b0.f38549a;
        } else if (ordinal == 42) {
            String str2 = "PARAM_EDIT_TEXT_FONT";
            String str3 = "PARAM_EDIT_TEXT_COLOR_BG_INT";
            if (bundle2 != null) {
                mo152206q();
                this.f316673u.mo160546x(bundle2.getCharSequence("PARAM_EDIT_TEXT_CONTENT"), bundle2.getInt("PARAM_EDIT_TEXT_COLOR"), bundle2.getInt(str3), bundle2.getString(str2));
                C13598b0 b0Var3 = C13598b0.f38549a;
            }
            C13598b0 b0Var4 = C13598b0.f38549a;
        } else if (ordinal != 53) {
            String str4 = "MicroMsg.MultiVideoPluginLayout";
            if (ordinal != 70) {
                if (ordinal == 45) {
                    mo152205o();
                    this.f316635M.setVisibility(4);
                } else if (ordinal != 46) {
                    switch (ordinal) {
                        case 32:
                        case 33:
                        case 34:
                            if (bVar2 == C101198e.C101199b.EDIT_VIDEO_WITH_TEXT) {
                                mo152206q();
                            }
                            mo152205o();
                            C13598b0 b0Var5 = C13598b0.f38549a;
                            return;
                        case 35:
                            if (bundle2 != null) {
                                getMultiPreviewPlugin().mo160453L((long) bundle2.getInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT"));
                                C13598b0 b0Var6 = C13598b0.f38549a;
                            }
                            C13598b0 b0Var7 = C13598b0.f38549a;
                            return;
                        case 36:
                            this.f316672t.mo138867z();
                            C13598b0 b0Var8 = C13598b0.f38549a;
                            return;
                        case 37:
                            if (bundle2 != null) {
                                C92007a C = this.f316670r.mo161845C();
                                CharSequence charSequence = bundle2.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                                int i2 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR");
                                int i3 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                                String string2 = bundle2.getString("PARAM_EDIT_TEXT_FONT");
                                C87412m.m108591d(string2);
                                C92025s sVar = new C92025s(charSequence, i2, i3, string2, 0, (Matrix) null, 48, (C8480h) null);
                                sVar.mo125866h(this.f316626D);
                                C13598b0 b0Var9 = C13598b0.f38549a;
                                C110351a aVar = this.f316670r;
                                C106205q0 h = this.f316629G.mo152115h();
                                String str5 = this.f316625C;
                                C109202j multiPreviewPlugin = getMultiPreviewPlugin();
                                multiPreviewPlugin.mo160461y();
                                VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f326970j;
                                C87412m.m108591d(videoCompositionPlayView);
                                aVar.mo161860x(sVar, h, str5, videoCompositionPlayView.getPosition());
                                if (this.f316626D) {
                                    if (C == null) {
                                        C110351a aVar2 = this.f316670r;
                                        aVar2.getClass();
                                        aVar2.f330094g = sVar;
                                        C101198e.C62622a.m73576a(aVar2.f291492d, C101198e.C101199b.EDIT_VLOG_EDIT_TIME, (Bundle) null, 2, (Object) null);
                                    } else {
                                        m142944z(this, false, false, 0, 7, (Object) null);
                                    }
                                }
                            }
                            C13598b0 b0Var10 = C13598b0.f38549a;
                            return;
                        case 38:
                            this.f316673u.f327360h.performClick();
                            C13598b0 b0Var11 = C13598b0.f38549a;
                            return;
                        default:
                            switch (ordinal) {
                                case 48:
                                    mo152206q();
                                    mo152205o();
                                    C13598b0 b0Var12 = C13598b0.f38549a;
                                    return;
                                case 49:
                                    post(new C106235n(this));
                                    mo152198C();
                                    C110351a aVar3 = this.f316670r;
                                    C92007a aVar4 = aVar3.f330094g;
                                    if (aVar4 != null) {
                                        aVar3.mo161858P(aVar4);
                                    }
                                    C13598b0 b0Var13 = C13598b0.f38549a;
                                    return;
                                case 50:
                                    if (bundle2 != null) {
                                        Boolean.valueOf(bundle2.getBoolean("PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN")).booleanValue();
                                        m142944z(this, true, true, 0, 4, (Object) null);
                                        C13598b0 b0Var14 = C13598b0.f38549a;
                                    }
                                    C13598b0 b0Var15 = C13598b0.f38549a;
                                    return;
                                default:
                                    switch (ordinal) {
                                        case 57:
                                            mo152206q();
                                            C13598b0 b0Var16 = C13598b0.f38549a;
                                            return;
                                        case 58:
                                            boolean z2 = bundle2 != null ? bundle2.getBoolean("PARAM_1_BOOLEAN", false) : false;
                                            if (z2 || (!z2 && this.f316643S0.mo160432y())) {
                                                m142944z(this, false, false, 0, 7, (Object) null);
                                            }
                                            C13598b0 b0Var17 = C13598b0.f38549a;
                                            return;
                                        case 59:
                                            C98324b bVar3 = this.f316628F;
                                            if (bVar3 != null) {
                                                RecordConfigProvider recordConfigProvider = this.f316627E;
                                                if (bVar3.mo137613c() - bVar3.mo137618g() > (recordConfigProvider != null ? recordConfigProvider.f272935w : 10000) + 250) {
                                                    Context context = getContext();
                                                    C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                                                    ((Activity) context).setResult(3000);
                                                    Context context2 = getContext();
                                                    C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                                                    ((Activity) context2).finish();
                                                    return;
                                                }
                                                this.f316670r.f330093f.setEnableTouch(true);
                                                C110992d.f332425a.mo162677k("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
                                                C13598b0 b0Var18 = C13598b0.f38549a;
                                            }
                                            C13598b0 b0Var19 = C13598b0.f38549a;
                                            return;
                                        case 60:
                                            this.f316674v.mo159390x();
                                            this.f316670r.f330093f.setEnableTouch(true);
                                            C110992d.f332425a.mo162677k("KEY_EXIT_CROP_PAGE_TIME_MS_LONG", Long.valueOf(System.currentTimeMillis()));
                                            C13598b0 b0Var20 = C13598b0.f38549a;
                                            return;
                                        default:
                                            C92011d dVar3 = dVar;
                                            C92011d dVar4 = dVar2;
                                            switch (ordinal) {
                                                case 62:
                                                    mo152200E();
                                                    C13598b0 b0Var21 = C13598b0.f38549a;
                                                    return;
                                                case 63:
                                                    if (bundle2 != null && !bundle2.getBoolean("PARAM_VIDEO_NEED_CROP")) {
                                                        this.f316674v.mo159390x();
                                                    }
                                                    this.f316623A.mo86128x();
                                                    Context context3 = getContext();
                                                    C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                                                    ((ViewGroup) ((Activity) context3).getWindow().getDecorView().findViewById(16908290)).setAlpha(1.0f);
                                                    if (!(this.f316636N.f327042f.getVisibility() == 0)) {
                                                        mo152198C();
                                                    }
                                                    this.f316677x0.mo160469x(true);
                                                    FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
                                                    Log.m105924i("MicroMsg.FinderVideoShell", "markFirstFrameShow");
                                                    if (FinderVideoShell.f82205h <= 0) {
                                                        FinderVideoShell.f82205h = Util.currentTicks();
                                                    }
                                                    C13598b0 b0Var22 = C13598b0.f38549a;
                                                    return;
                                                case 64:
                                                    if (bundle2 != null) {
                                                        int i4 = bundle2.getInt("PARAM_DELETE_VIEW_TYPE_INT");
                                                        if (i4 == 4) {
                                                            this.f316674v.mo159381A();
                                                        } else if (i4 == 6) {
                                                            this.f316680z.mo160718z(0);
                                                        } else if (i4 == 7) {
                                                            this.f316680z.mo160718z(1);
                                                        }
                                                        C13598b0 b0Var23 = C13598b0.f38549a;
                                                    }
                                                    m142944z(this, true, false, 0, 6, (Object) null);
                                                    C13598b0 b0Var24 = C13598b0.f38549a;
                                                    return;
                                                default:
                                                    switch (ordinal) {
                                                        case 72:
                                                        case 73:
                                                            break;
                                                        case 74:
                                                            mo152198C();
                                                            this.f316633K.setVisibility(0);
                                                            this.f316671s.reset();
                                                            C13598b0 b0Var25 = C13598b0.f38549a;
                                                            return;
                                                        case 75:
                                                            this.f316671s.mo160423B();
                                                            C13598b0 b0Var26 = C13598b0.f38549a;
                                                            return;
                                                        case 76:
                                                            this.f316671s.mo160426y();
                                                            C13598b0 b0Var27 = C13598b0.f38549a;
                                                            return;
                                                        case 77:
                                                            this.f316671s.reset();
                                                            if (bundle2 != null) {
                                                                this.f316671s.mo160427z(bundle2.getInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT"));
                                                                C13598b0 b0Var28 = C13598b0.f38549a;
                                                            }
                                                            C13598b0 b0Var29 = C13598b0.f38549a;
                                                            return;
                                                        case 78:
                                                            this.f316671s.mo160424C();
                                                            C13598b0 b0Var30 = C13598b0.f38549a;
                                                            return;
                                                        default:
                                                            C92011d dVar5 = dVar3;
                                                            String str6 = "";
                                                            String str7 = "PARAM_EDIT_TEXT_FONT";
                                                            String str8 = "PARAM_EDIT_TEXT_COLOR_BG_INT";
                                                            C108536c cVar3 = cVar;
                                                            String str9 = "EDIT_VLOG_TRACK_CROP_CONFIRM";
                                                            switch (ordinal) {
                                                                case 93:
                                                                    if (!(bundle2 == null || (galleryItem$MediaItem = (GalleryItem$MediaItem) bundle2.getParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE")) == null)) {
                                                                        this.f316640R.mo84844a(IXWebBroadcastListener.STAGE_START, "select first image");
                                                                        this.f316634L.reset();
                                                                        this.f316671s.reset();
                                                                        C109184f0 f0Var = this.f316671s;
                                                                        C106234m mVar = new C106234m(this, galleryItem$MediaItem);
                                                                        f0Var.getClass();
                                                                        f0Var.f326906f.post(new C109184f0.C109185c(mVar));
                                                                        C13598b0 b0Var31 = C13598b0.f38549a;
                                                                    }
                                                                    C13598b0 b0Var32 = C13598b0.f38549a;
                                                                    return;
                                                                case 94:
                                                                    C108536c cVar4 = cVar3;
                                                                    if (bundle2 != null) {
                                                                        int i5 = bundle2.getInt("EDIT_VLOG_SELECT_TRACK", -1);
                                                                        if (i5 >= 0) {
                                                                            this.f316658d1 = cVar4;
                                                                            C106205q0 q0Var = (C106205q0) C110818d0.m150917O(this.f316629G.mo152114g().mo134618o(), i5);
                                                                            if (q0Var != null) {
                                                                                if (this.f316646U.mo160404x() != i5) {
                                                                                    mo152205o();
                                                                                    this.f316629G.mo152124u(q0Var);
                                                                                    long max = Math.max(this.f316629G.mo152114g().mo134615l(), q0Var.mo152158i());
                                                                                    getMultiPreviewPlugin().mo160455N(max, Math.min(this.f316629G.mo152114g().mo134613j(), q0Var.mo152156g()));
                                                                                    getMultiPreviewPlugin().mo160453L(max);
                                                                                    this.f316646U.mo160406z(i5);
                                                                                    this.f316646U.setVisibility(0);
                                                                                    this.f316650W.mo161962B(i5);
                                                                                }
                                                                                C13598b0 b0Var33 = C13598b0.f38549a;
                                                                            }
                                                                        }
                                                                        C13598b0 b0Var34 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 95:
                                                                    String str10 = str9;
                                                                    this.f316626D = true;
                                                                    if (bundle2 != null) {
                                                                        if (bundle2.getBoolean("EDIT_VLOG_TRACK_CROP_CHANGE")) {
                                                                            this.f316629G.f316438t.mo81182a(bundle2.getLong("EDIT_VLOG_TRACK_CROP_START"), bundle2.getLong("EDIT_VLOG_TRAKC_CROP_END"));
                                                                            getMultiPreviewPlugin().mo160450H(this.f316674v.mo159392z());
                                                                        } else {
                                                                            mo152198C();
                                                                            getMultiPreviewPlugin().mo160454M(0);
                                                                            getMultiPreviewPlugin().getClass();
                                                                            boolean z3 = bundle2.getBoolean(str10);
                                                                            int i6 = bundle2.getInt("EDIT_TRACK_DURATION_CUT_COUNT");
                                                                            int i7 = bundle2.getInt("EDIT_TRACK_DURATION_SCROLL_COUNT");
                                                                            long j = bundle2.getLong("EDIT_VLOG_TRACK_CROP_START");
                                                                            long j2 = bundle2.getLong("EDIT_VLOG_TRAKC_CROP_END");
                                                                            C106205q0 h2 = this.f316629G.mo152115h();
                                                                            long i8 = h2 != null ? h2.mo152158i() : 0;
                                                                            this.f316629G.mo152118k(z3, j, j2, i6, i7, this.f316658d1 == cVar2);
                                                                            this.f316670r.f330093f.setSegmentOffset(0);
                                                                            m142944z(this, true, false, i8, 2, (Object) null);
                                                                            if (this.f316658d1 == cVar3) {
                                                                                mo152213y();
                                                                            }
                                                                        }
                                                                        C13598b0 b0Var35 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 96:
                                                                    if (bundle2 != null) {
                                                                        mo152198C();
                                                                        if (bundle2.getBoolean(str9)) {
                                                                            C106195f0 f0Var2 = this.f316629G;
                                                                            C109154a aVar5 = this.f316637P;
                                                                            C96552p0 g = f0Var2.mo152114g();
                                                                            aVar5.mo160395A(g, false);
                                                                            f0Var2.mo152110a(g, true);
                                                                        } else {
                                                                            C106195f0 f0Var3 = this.f316629G;
                                                                            C109154a aVar6 = this.f316637P;
                                                                            C96552p0 g2 = f0Var3.mo152114g();
                                                                            aVar6.mo160395A(g2, true);
                                                                            f0Var3.mo152110a(g2, true);
                                                                        }
                                                                        getMultiPreviewPlugin().mo160450H(this.f316674v.mo159392z());
                                                                        this.f316643S0.mo160429A();
                                                                        this.f316643S0.mo160430B();
                                                                        C13598b0 b0Var36 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 97:
                                                                case 98:
                                                                    if (bundle2 != null) {
                                                                        int i9 = bundle2.getInt("EDIT_COMPOSITION_TRACK_INDEX");
                                                                        boolean z4 = bundle2.getBoolean("EDIT_COMPOSITION_LEFT");
                                                                        this.f316629G.mo152117j(i9, bundle2.getLong("EDIT_VLOG_TRACK_CROP_START"), bundle2.getLong("EDIT_VLOG_TRAKC_CROP_END"));
                                                                        C106205q0 q0Var2 = (C106205q0) ((ArrayList) this.f316629G.mo152114g().mo134619p()).get(i9);
                                                                        m142943t(this, false, false, z4 ? q0Var2.mo152158i() : q0Var2.mo152156g(), 2, (Object) null);
                                                                        C13598b0 b0Var37 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 99:
                                                                    if (bundle2 != null) {
                                                                        int i15 = bundle2.getInt("EDIT_VLOG_SELECT_TRACK", -1);
                                                                        C106205q0 q0Var3 = (C106205q0) C110818d0.m150917O(this.f316629G.mo152114g().mo134618o(), i15);
                                                                        if (q0Var3 != null) {
                                                                            getMultiPreviewPlugin().mo160454M(q0Var3.mo152158i());
                                                                            this.f316635M.setVisibility(4);
                                                                            this.f316670r.f330093f.setSegmentOffset(q0Var3.mo152158i());
                                                                            long j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                                                                            long longValue = this.f316629G.mo152114g().mo134612i().mo12992b().longValue();
                                                                            if (longValue != -1) {
                                                                                j3 = ((long) (((float) (longValue - q0Var3.mo152158i())) * q0Var3.mo152157h())) + q0Var3.mo152160k();
                                                                            }
                                                                            this.f316629G.mo152116i(i15);
                                                                            this.f316636N.mo160476x().setEnableLengthEdit(!this.f316629G.mo152121r());
                                                                            C109235u0 u0Var = this.f316636N;
                                                                            C106205q0 h3 = this.f316629G.mo152115h();
                                                                            C87412m.m108591d(h3);
                                                                            C109235u0.m148334y(u0Var, h3, false, j3, 2, (Object) null);
                                                                            getMultiPreviewPlugin().mo160450H(this.f316674v.mo159392z());
                                                                            this.f316643S0.mo160429A();
                                                                            C13598b0 b0Var38 = C13598b0.f38549a;
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 100:
                                                                    mo152205o();
                                                                    this.f316638Q.mo161542x().setEnableLengthEdit(!this.f316629G.mo152121r());
                                                                    this.f316638Q.mo161543y(this.f316670r.mo161845C());
                                                                    C92007a C2 = this.f316670r.mo161845C();
                                                                    if (!(C2 == null || (d = C2.mo125862d()) == null)) {
                                                                        getMultiPreviewPlugin().mo160455N(d.mo146049c(), d.mo146048b());
                                                                        C13598b0 b0Var39 = C13598b0.f38549a;
                                                                    }
                                                                    this.f316638Q.mo161544z(this.f316629G.mo152114g());
                                                                    m142944z(this, false, false, 0, 7, (Object) null);
                                                                    C13598b0 b0Var40 = C13598b0.f38549a;
                                                                    return;
                                                                case 101:
                                                                    mo152198C();
                                                                    C92007a C3 = this.f316670r.mo161845C();
                                                                    C92023q qVar = C3 instanceof C92023q ? (C92023q) C3 : null;
                                                                    if (qVar != null) {
                                                                        EffectManager d2 = C106976a.f320208a.mo157400d();
                                                                        C87412m.m108591d(d2);
                                                                        C110625c0 l = d2.mo154932l(qVar.mo125985l());
                                                                        if (l != null) {
                                                                            l.mo162189b(qVar.mo125862d().mo146049c(), qVar.mo125862d().mo146048b());
                                                                            C13598b0 b0Var41 = C13598b0.f38549a;
                                                                        }
                                                                        C110644t tVar = l instanceof C110644t ? (C110644t) l : null;
                                                                        if (tVar != null) {
                                                                            tVar.mo162193e(new C110629f((int) qVar.mo125982i(), (int) qVar.mo125983j(), qVar.mo125987n(), qVar.mo125986m()));
                                                                            C13598b0 b0Var42 = C13598b0.f38549a;
                                                                        }
                                                                        C110646v vVar = l instanceof C110646v ? (C110646v) l : null;
                                                                        if (vVar != null) {
                                                                            vVar.mo162194f(new C110630g(qVar.mo125988o(), 0.0f, (String) null, false, false, 30, (C8480h) null));
                                                                            C13598b0 b0Var43 = C13598b0.f38549a;
                                                                        }
                                                                    }
                                                                    this.f316670r.mo161855M(false);
                                                                    if (bundle2 != null) {
                                                                        m142944z(this, true, false, bundle2.getLong("PARAM_1_LONG"), 2, (Object) null);
                                                                        C13598b0 b0Var44 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 102:
                                                                    C109202j multiPreviewPlugin2 = getMultiPreviewPlugin();
                                                                    C106205q0 q0Var4 = (C106205q0) C110818d0.m150917O(this.f316629G.mo152114g().mo134619p(), this.f316650W.mo161965x());
                                                                    multiPreviewPlugin2.mo160454M(q0Var4 != null ? q0Var4.mo152158i() : 0);
                                                                    this.f316629G.mo152116i(this.f316650W.mo161965x());
                                                                    C109219q0 q0Var5 = this.f316648V;
                                                                    C106205q0 h4 = this.f316629G.mo152115h();
                                                                    C87412m.m108591d(h4);
                                                                    q0Var5.mo160471y(h4.mo152157h());
                                                                    this.f316648V.mo160470x().setShow(true);
                                                                    C13598b0 b0Var45 = C13598b0.f38549a;
                                                                    return;
                                                                case 103:
                                                                    if (bundle2 != null) {
                                                                        long j4 = bundle2.getLong("EDIT_CROP_VLOG_LENGTH_START_TIME_LONG");
                                                                        long j5 = bundle2.getLong("EDIT_CROP_VLOG_LENGTH_END_TIME_LONG");
                                                                        long j6 = bundle2.getLong("EDIT_CROP_VLOG_SEEKTIME_LONG");
                                                                        if (bundle2.getBoolean("EDIT_CROP_VLOG_ON_UP_BOOLEAN")) {
                                                                            m142944z(this, true, true, 0, 4, (Object) null);
                                                                        } else {
                                                                            mo152206q();
                                                                            getMultiPreviewPlugin().mo160453L(j6);
                                                                        }
                                                                        getMultiPreviewPlugin().mo160455N(j4, j5);
                                                                        C13598b0 b0Var46 = C13598b0.f38549a;
                                                                    }
                                                                    C13598b0 b0Var47 = C13598b0.f38549a;
                                                                    return;
                                                                case 104:
                                                                    if (bundle2 != null && (emojiInfo = (EmojiInfo) bundle2.getParcelable("PARAM_EDIT_EMOJI_INFO")) != null) {
                                                                        C110351a aVar7 = this.f316670r;
                                                                        C92012f fVar = new C92012f(emojiInfo, (Matrix) null, (Matrix) null, 6, (C8480h) null);
                                                                        fVar.mo125866h(this.f316626D);
                                                                        C13598b0 b0Var48 = C13598b0.f38549a;
                                                                        C110351a.m150172z(aVar7, fVar, this.f316629G.mo152115h(), this.f316625C, 0, 8, (Object) null);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 105:
                                                                    if (bundle2 != null) {
                                                                        this.f316635M.setVisibility(4);
                                                                        this.f316629G.mo152123t(bundle2.getFloat("EDIT_TRACK_DURATION_SCALE", 1.0f));
                                                                        getMultiPreviewPlugin().mo160450H(this.f316674v.mo159392z());
                                                                        C13598b0 b0Var49 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 106:
                                                                    if (bundle2 != null) {
                                                                        this.f316629G.mo152123t(bundle2.getFloat("EDIT_TRACK_DURATION_SCALE", 1.0f));
                                                                        mo152198C();
                                                                        getMultiPreviewPlugin().mo160454M(0);
                                                                        getMultiPreviewPlugin().getClass();
                                                                        C106205q0 h5 = this.f316629G.mo152115h();
                                                                        long i16 = h5 != null ? h5.mo152158i() : 0;
                                                                        C106195f0.m142873l(this.f316629G, true, 0, 0, 0, 0, false, 30, (Object) null);
                                                                        m142944z(this, true, false, i16, 2, (Object) null);
                                                                        mo152213y();
                                                                        C13598b0 b0Var50 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 107:
                                                                    if (bundle2 != null) {
                                                                        if (bundle2.getBoolean("EDIT_FILTER_SHOW")) {
                                                                            mo152205o();
                                                                        } else {
                                                                            mo152198C();
                                                                        }
                                                                        C13598b0 b0Var51 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 108:
                                                                    if (bundle2 != null) {
                                                                        C92011d dVar6 = bundle2.getInt("PARAM_1_INT") == 0 ? dVar5 : dVar4;
                                                                        byte[] byteArray = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                                                        C87412m.m108591d(byteArray);
                                                                        C110351a.m150172z(this.f316670r, new C92010c(dVar6, byteArray), this.f316629G.mo152115h(), this.f316625C, 0, 8, (Object) null);
                                                                        C13598b0 b0Var52 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 109:
                                                                    String str11 = str8;
                                                                    String str12 = str7;
                                                                    if (bundle2 != null) {
                                                                        if (bundle2.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                            this.f316680z.f327700z++;
                                                                            mo152206q();
                                                                            int i17 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                                                            int i18 = bundle2.getInt(str11, 0);
                                                                            String string3 = bundle2.getString(str12);
                                                                            C109348i iVar = this.f316673u;
                                                                            byte[] byteArray2 = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                                                            C87412m.m108591d(byteArray2);
                                                                            iVar.mo160548z(byteArray2, i17, i18, string3);
                                                                        }
                                                                        C13598b0 b0Var53 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 110:
                                                                    if (bundle2 != null) {
                                                                        if (bundle2.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                            mo152206q();
                                                                            mo152205o();
                                                                            C109475c cVar5 = this.f316680z;
                                                                            byte[] byteArray3 = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                                                            C87412m.m108591d(byteArray3);
                                                                            cVar5.mo160714F(byteArray3);
                                                                        }
                                                                        C13598b0 b0Var54 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 111:
                                                                    if (bundle2 != null) {
                                                                        if (bundle2.getByteArray("PARAM_1_BYTEARRAY") != null) {
                                                                            int i19 = bundle2.getInt("PARAM_EDIT_TEXT_COLOR", 0);
                                                                            int i25 = bundle2.getInt(str8, 0);
                                                                            String string4 = bundle2.getString(str7);
                                                                            C109475c cVar6 = this.f316680z;
                                                                            byte[] byteArray4 = bundle2.getByteArray("PARAM_1_BYTEARRAY");
                                                                            C87412m.m108591d(byteArray4);
                                                                            cVar6.mo160716H(byteArray4, i19, i25, string4);
                                                                        }
                                                                        if (bundle2.getLong("PARAM_1_LONG", -1) >= 0) {
                                                                            m142944z(this, false, false, bundle2.getLong("PARAM_1_LONG"), 3, (Object) null);
                                                                        }
                                                                        C13598b0 b0Var55 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 112:
                                                                    if (bundle2 != null) {
                                                                        int i26 = bundle2.getInt("PARAM_1_INT");
                                                                        C110351a aVar8 = this.f316670r;
                                                                        C92011d dVar7 = i26 == 1 ? dVar4 : dVar5;
                                                                        aVar8.getClass();
                                                                        aVar8.f330093f.mo152267m(dVar7);
                                                                        C13598b0 b0Var56 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 113:
                                                                    m142944z(this, false, false, 0, 7, (Object) null);
                                                                    this.f316670r.f330093f.mo152274r();
                                                                    C13598b0 b0Var57 = C13598b0.f38549a;
                                                                    return;
                                                                case 114:
                                                                    this.f316658d1 = cVar2;
                                                                    mo152198C();
                                                                    if (!this.f316629G.mo152120q() || this.f316649V0) {
                                                                        C96552p0 g3 = this.f316629G.mo152114g();
                                                                        getMultiPreviewPlugin().mo160455N(g3.mo134615l(), g3.mo134613j());
                                                                        if (this.f316643S0.mo160432y()) {
                                                                            i = 4;
                                                                            m142944z(this, false, false, 0, 7, (Object) null);
                                                                        } else {
                                                                            i = 4;
                                                                        }
                                                                        this.f316629G.mo152124u((C106205q0) null);
                                                                        this.f316635M.mo160474x(-1, 0, 0);
                                                                        this.f316646U.mo160406z(-1);
                                                                        this.f316646U.setVisibility(i);
                                                                        this.f316650W.mo161962B(-1);
                                                                        this.f316650W.setVisibility(0);
                                                                    }
                                                                    C13598b0 b0Var58 = C13598b0.f38549a;
                                                                    return;
                                                                case 115:
                                                                    this.f316635M.f327035h.mo152397b(true);
                                                                    C13598b0 b0Var59 = C13598b0.f38549a;
                                                                    return;
                                                                case 116:
                                                                    this.f316635M.f327035h.mo152397b(false);
                                                                    C13598b0 b0Var60 = C13598b0.f38549a;
                                                                    return;
                                                                case 117:
                                                                    if (bundle2 != null) {
                                                                        int i27 = bundle2.getInt("EDIT_SELECT_TRANSITION_INDEX");
                                                                        C96552p0 g4 = this.f316629G.mo152114g();
                                                                        ArrayList arrayList = (ArrayList) g4.mo134619p();
                                                                        C106205q0 q0Var6 = (C106205q0) arrayList.get(i27 + 1);
                                                                        long g5 = ((C106205q0) arrayList.get(i27)).mo152156g() - (q0Var6.mo152159j().mo162364b().mo162375a() / ((long) 2));
                                                                        long max2 = Math.max(0, g5 - 1000);
                                                                        getMultiPreviewPlugin().mo160455N(max2, Math.min(g4.getDurationMs(), g5 + 1000));
                                                                        getMultiPreviewPlugin().mo160453L(max2);
                                                                        this.f316650W.mo161963C(max2);
                                                                        C110496a aVar9 = this.f316650W;
                                                                        int l2 = q0Var6.mo152161l();
                                                                        aVar9.mo161961A();
                                                                        aVar9.mo161967z().mo107635b(i27, l2);
                                                                        aVar9.f330404h.setShow(true);
                                                                        C13598b0 b0Var61 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 118:
                                                                    C96552p0 g6 = this.f316629G.mo152114g();
                                                                    getMultiPreviewPlugin().mo160455N(g6.mo134615l(), g6.mo134613j());
                                                                    getMultiPreviewPlugin().mo160453L(this.f316650W.mo161966y());
                                                                    mo152213y();
                                                                    C13598b0 b0Var62 = C13598b0.f38549a;
                                                                    return;
                                                                case 119:
                                                                    mo152198C();
                                                                    List<C106205q0> p = this.f316629G.mo152114g().mo134619p();
                                                                    C109232t0 t0Var = this.f316635M;
                                                                    ArrayList arrayList2 = (ArrayList) p;
                                                                    List<C106205q0> t0 = C110818d0.m150948t0(arrayList2, arrayList2.size() - 1);
                                                                    ArrayList arrayList3 = new ArrayList(C36907w.m41090l(t0, 10));
                                                                    for (C106205q0 q0Var7 : t0) {
                                                                        arrayList3.add(Boolean.valueOf(q0Var7.f316501l.f331477o.mo162376b()));
                                                                    }
                                                                    t0Var.mo160475y(arrayList3);
                                                                    C13598b0 b0Var63 = C13598b0.f38549a;
                                                                    return;
                                                                case 120:
                                                                    if (bundle2 != null) {
                                                                        int i28 = bundle2.getInt("EDIT_SELECT_TRANSITION_INDEX");
                                                                        int i29 = bundle2.getInt("EDIT_TRANSITION_EFFECT_ID");
                                                                        C96552p0 g7 = this.f316629G.mo152114g();
                                                                        ArrayList arrayList4 = (ArrayList) g7.mo134619p();
                                                                        C106205q0 q0Var8 = (C106205q0) arrayList4.get(i28 + 1);
                                                                        C106976a.f320208a.mo157405i(q0Var8, i29);
                                                                        long g8 = ((C106205q0) arrayList4.get(i28)).mo152156g() - (q0Var8.mo152159j().mo162364b().mo162375a() / ((long) 2));
                                                                        long max3 = Math.max(0, g8 - 1000);
                                                                        long min = Math.min(g7.getDurationMs(), g8 + 1000);
                                                                        m142944z(this, true, false, max3, 2, (Object) null);
                                                                        getMultiPreviewPlugin().mo160455N(max3, min);
                                                                        C13598b0 b0Var64 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 121:
                                                                    if (bundle2 != null) {
                                                                        int i35 = bundle2.getInt("EDIT_TRANSITION_EFFECT_ID");
                                                                        C96552p0 g9 = this.f316629G.mo152114g();
                                                                        C106976a.f320208a.mo157398b(g9.mo134619p(), i35);
                                                                        int i36 = bundle2.getInt("EDIT_SELECT_TRANSITION_INDEX");
                                                                        ArrayList arrayList5 = (ArrayList) g9.mo134619p();
                                                                        m142944z(this, true, false, Math.max(0, (((C106205q0) arrayList5.get(i36)).mo152156g() - (((C106205q0) arrayList5.get(i36 + 1)).mo152159j().mo162364b().mo162375a() / ((long) 2))) - 1000), 2, (Object) null);
                                                                        C13598b0 b0Var65 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 122:
                                                                    if (bundle2 != null) {
                                                                        String string5 = bundle2.getString("EDIT_PAG_STICKER_PATH");
                                                                        if (string5 != null) {
                                                                            C106976a aVar10 = C106976a.f320208a;
                                                                            EffectManager d3 = aVar10.mo157400d();
                                                                            if (d3 != null) {
                                                                                C110632i iVar2 = C110632i.PAGTextEffect;
                                                                                AssetManager assets = getContext().getAssets();
                                                                                C87412m.m108593f(assets, "context.assets");
                                                                                c0Var = d3.mo154928h(iVar2, assets, string5);
                                                                            } else {
                                                                                c0Var = null;
                                                                            }
                                                                            EffectManager d4 = aVar10.mo157400d();
                                                                            if (d4 != null) {
                                                                                d4.mo154923c(c0Var);
                                                                            }
                                                                            long a = c0Var != null ? c0Var.mo162188a() : 0;
                                                                            C110642r rVar = c0Var instanceof C110642r ? (C110642r) c0Var : null;
                                                                            if (rVar == null || (size = rVar.mo162192d()) == null) {
                                                                                size = new Size(0, 0);
                                                                            }
                                                                            String string6 = getContext().getString(C0966R.string.c3e);
                                                                            C87412m.m108593f(string6, "context.getString(R.string.edit_pag_text_default)");
                                                                            C110646v vVar2 = c0Var instanceof C110646v ? (C110646v) c0Var : null;
                                                                            if (vVar2 != null) {
                                                                                vVar2.mo162194f(new C110630g(string6, 0.0f, (String) null, false, false, 30, (C8480h) null));
                                                                                C13598b0 b0Var66 = C13598b0.f38549a;
                                                                            }
                                                                            C92023q qVar2 = new C92023q(string5, (Matrix) null, 2, (C8480h) null);
                                                                            qVar2.mo125990q(a);
                                                                            qVar2.mo125993t(string6);
                                                                            qVar2.mo125866h(this.f316626D);
                                                                            qVar2.mo125994u(size.getWidth());
                                                                            qVar2.mo125991r(size.getHeight());
                                                                            qVar2.mo125984k().set(getMultiPreviewPlugin().mo160446D());
                                                                            float b = (float) C76577a.m92151b(getContext(), 160);
                                                                            qVar2.mo125992s(Math.min(Math.min(b / ((float) size.getWidth()), b / ((float) size.getHeight())), 1.0f));
                                                                            qVar2.mo125989p(new C106236o(a, qVar2, this));
                                                                            C110351a.m150172z(this.f316670r, qVar2, this.f316629G.mo152115h(), this.f316625C, 0, 8, (Object) null);
                                                                        }
                                                                        C13598b0 b0Var67 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 123:
                                                                    if (bundle2 != null) {
                                                                        mo152206q();
                                                                        mo152205o();
                                                                        CharSequence charSequence2 = bundle2.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                                                                        C109213j0 j0Var = this.f316668p0;
                                                                        String str13 = (charSequence2 == null || (obj = charSequence2.toString()) == null) ? str6 : obj;
                                                                        j0Var.getClass();
                                                                        j0Var.f327000f.setup(str13);
                                                                        j0Var.f327000f.setShow(true);
                                                                        C13598b0 b0Var68 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 124:
                                                                    if (bundle2 != null) {
                                                                        String string7 = bundle2.getString("EDIT_PAG_CHANGE_TEXT");
                                                                        String str14 = string7 == null ? str6 : string7;
                                                                        C92007a C4 = this.f316670r.mo161845C();
                                                                        C92023q qVar3 = C4 instanceof C92023q ? (C92023q) C4 : null;
                                                                        if (qVar3 != null) {
                                                                            qVar3.mo125993t(str14);
                                                                            EffectManager d5 = C106976a.f320208a.mo157400d();
                                                                            C87412m.m108591d(d5);
                                                                            C110625c0 l3 = d5.mo154932l(qVar3.mo125985l());
                                                                            C110646v vVar3 = l3 instanceof C110646v ? (C110646v) l3 : null;
                                                                            if (vVar3 != null) {
                                                                                vVar3.mo162194f(new C110630g(qVar3.mo125988o(), 0.0f, (String) null, false, false, 30, (C8480h) null));
                                                                                C13598b0 b0Var69 = C13598b0.f38549a;
                                                                            }
                                                                        }
                                                                        m142944z(this, false, false, 0, 7, (Object) null);
                                                                        C13598b0 b0Var70 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 125:
                                                                case 126:
                                                                case 127:
                                                                    mo152205o();
                                                                    C13598b0 b0Var71 = C13598b0.f38549a;
                                                                    return;
                                                                case 128:
                                                                    mo152198C();
                                                                    break;
                                                                case 129:
                                                                    C92007a C5 = this.f316670r.mo161845C();
                                                                    if (C5 != null) {
                                                                        mo152206q();
                                                                        this.f316624B.mo161249z(C5);
                                                                        C13598b0 b0Var72 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 130:
                                                                    if (bundle2 != null) {
                                                                        long j7 = bundle2.getLong("PARAM_1_LONG");
                                                                        C92007a C6 = this.f316670r.mo161845C();
                                                                        C92023q qVar4 = C6 instanceof C92023q ? (C92023q) C6 : null;
                                                                        if (qVar4 != null) {
                                                                            EffectManager d6 = C106976a.f320208a.mo157400d();
                                                                            C87412m.m108591d(d6);
                                                                            C110625c0 l4 = d6.mo154932l(qVar4.mo125985l());
                                                                            if (l4 != null) {
                                                                                l4.mo162189b(qVar4.mo125862d().mo146049c(), qVar4.mo125862d().mo146048b());
                                                                                C13598b0 b0Var73 = C13598b0.f38549a;
                                                                            }
                                                                        }
                                                                        this.f316670r.mo161857O();
                                                                        this.f316670r.mo161855M(false);
                                                                        m142944z(this, true, false, j7, 2, (Object) null);
                                                                        C13598b0 b0Var74 = C13598b0.f38549a;
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 131:
                                                                    this.f316670r.mo161855M(false);
                                                                    m142944z(this, false, false, 0, 7, (Object) null);
                                                                    C13598b0 b0Var75 = C13598b0.f38549a;
                                                                    return;
                                                                case 132:
                                                                    this.f316670r.mo161857O();
                                                                    this.f316670r.mo161855M(false);
                                                                    m142944z(this, true, true, 0, 4, (Object) null);
                                                                    C13598b0 b0Var76 = C13598b0.f38549a;
                                                                    return;
                                                                case 133:
                                                                    setupTemplateVideoPlugins(this.f316679y0.mo138709x());
                                                                    C13598b0 b0Var77 = C13598b0.f38549a;
                                                                    return;
                                                                case 134:
                                                                    if (this.f316629G.mo152120q()) {
                                                                        setupImageEditPlugins(false);
                                                                        this.f316670r.mo161844B(false);
                                                                    } else {
                                                                        mo152196A();
                                                                    }
                                                                    C13598b0 b0Var78 = C13598b0.f38549a;
                                                                    return;
                                                                case 135:
                                                                    setupTemplateVideoPlugins(this.f316679y0.mo138709x());
                                                                    C13598b0 b0Var79 = C13598b0.f38549a;
                                                                    return;
                                                                case 136:
                                                                    boolean z5 = bundle2 != null ? bundle2.getBoolean("PARAM_1_BOOLEAN", false) : false;
                                                                    this.f316660f1 = z5;
                                                                    C106976a.f320208a.mo157406j(this.f316629G.mo152114g(), z5);
                                                                    if (z5) {
                                                                        getMultiPreviewPlugin().mo160457P();
                                                                    }
                                                                    if (this.f316629G.mo152120q() && !this.f316649V0) {
                                                                        C61196g gVar = this.f316633K;
                                                                        gVar.mo86111y(gVar.mo86110x());
                                                                    }
                                                                    getMultiPreviewPlugin().mo160443A();
                                                                    C13598b0 b0Var80 = C13598b0.f38549a;
                                                                    return;
                                                                case 137:
                                                                    this.f316674v.f324878j.setShow(true);
                                                                    C13598b0 b0Var81 = C13598b0.f38549a;
                                                                    return;
                                                                default:
                                                                    Log.m105924i(str4, "unknown key " + bVar);
                                                                    C13598b0 b0Var82 = C13598b0.f38549a;
                                                                    return;
                                                            }
                                                    }
                                                    C13598b0 b0Var83 = C13598b0.f38549a;
                                                    return;
                                            }
                                    }
                            }
                    }
                }
                C13598b0 b0Var84 = C13598b0.f38549a;
                return;
            }
            mo152205o();
            this.f316633K.setVisibility(4);
            C13598b0 b0Var85 = C13598b0.f38549a;
        } else {
            mo152205o();
            if (((LinkedList) this.f316629G.mo152119n()).size() == 1) {
                this.f316629G.mo152116i(0);
                C109235u0 u0Var2 = this.f316636N;
                C106205q0 h6 = this.f316629G.mo152115h();
                C87412m.m108591d(h6);
                C109235u0.m148334y(u0Var2, h6, false, 0, 6, (Object) null);
            } else {
                this.f316629G.mo152116i(-1);
                C106195f0 f0Var4 = this.f316629G;
                C109154a aVar11 = this.f316637P;
                C96552p0 g15 = f0Var4.mo152114g();
                aVar11.mo160400y(g15);
                f0Var4.mo152110a(g15, false);
                this.f316637P.mo160396B(this.f316629G.mo152114g(), this.f316664j);
            }
            getMultiPreviewPlugin().mo160450H(this.f316674v.mo159392z());
            this.f316643S0.mo160429A();
            C13598b0 b0Var86 = C13598b0.f38549a;
        }
    }

    /* renamed from: q */
    public final void mo152206q() {
        VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.pause();
        }
        this.f316635M.f327035h.f317020d.mo17155w1();
        C109202j.C99301e eVar = getMultiPreviewPlugin().f326959D;
        if (eVar != null) {
            eVar.pause();
        }
        this.f316643S0.mo160433z();
    }

    /* renamed from: r */
    public final void mo152207r(boolean z, boolean z2, long j) {
        C13604l<Long, Long> i = this.f316629G.f316438t.mo134612i();
        List<C13605o<String, Long, Long>> allTTSData = this.f316670r.f330093f.getAllTTSData();
        this.f316629G.mo152113f(this.f316629G.f316438t.mo134618o(), allTTSData);
        if (!(((Number) i.f38555d).longValue() == -1 || ((Number) i.f38556e).longValue() == -1)) {
            this.f316629G.f316438t.mo81182a(((Number) i.f38555d).longValue(), Math.min(((Number) i.f38556e).longValue(), this.f316629G.f316438t.getDurationMs()));
        }
        getMultiPreviewPlugin().mo160451I(this.f316674v.mo159392z(), z, z2, j);
        if (z) {
            this.f316643S0.mo160429A();
        } else {
            this.f316643S0.mo160433z();
        }
    }

    public void release() {
        super.release();
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "release");
        this.f316629G.dead();
        C106976a.f320208a.mo157410n();
        SparseArray<C97942y> sparseArray = C97944z.f287281a;
        List<String> list = C97592a.f286326a;
        C97944z.f287281a.remove(108);
        C110803f.f331490g.mo162371a();
    }

    public void reset() {
        super.reset();
        this.f316655a1 = WxCropOperationLayout.C94436h.RECT_ADJUST;
        setBackgroundColor(0);
        C106976a.f320208a.mo157403g();
    }

    public final void setCurrentStyle(WxCropOperationLayout.C94436h hVar) {
        C87412m.m108594g(hVar, "<set-?>");
        this.f316655a1 = hVar;
    }

    public final void setMultiPreviewPlugin(C109202j jVar) {
        C87412m.m108594g(jVar, "<set-?>");
        this.f316632J = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupImageEditPlugins(boolean r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setupImageEditPlugins, selectFirst:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MultiVideoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.vlog.model.f0 r0 = r10.f316629G
            r0.mo152128z()
            l23.i0 r0 = r10.f316639Q0
            r1 = 0
            r0.setVisibility(r1)
            l23.m0 r0 = r10.f316679y0
            r2 = 8
            r0.setVisibility(r2)
            l23.j r0 = r10.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f326970j
            if (r0 == 0) goto L_0x0033
            r0.stop()
        L_0x0033:
            l23.j r0 = r10.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f326970j
            if (r0 != 0) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            r0.setVisibility(r2)
        L_0x003f:
            q23.a r0 = r10.f316670r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r0.setVisibility(r1)
            r10.f316649V0 = r1
            l23.j r0 = r10.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r0 = r0.f326967g
            com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$h r2 = com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout.C94436h.RECT_ADJUST
            r0.setStyle(r2)
            r10.f316655a1 = r2
            r10.mo152197B()
            boolean r0 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r10.f316631I
            if (r0 != 0) goto L_0x00ad
            j23.a r2 = r10.f316674v
            h90.b r3 = r10.f316628F
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r10.f316627E
            r5 = 0
            boolean r6 = r10.f316630H
            com.tencent.mm.plugin.vlog.model.f0 r0 = r10.f316629G
            boolean r7 = r0.f316429h
            r8 = 4
            r9 = 0
            j23.C108531a.m147079H(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_edit_image_auto_add_music_panel
            int r2 = r2.mo58779Qe(r3, r1)
            r3 = 1
            if (r2 != r3) goto L_0x00a3
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_finder_edit_image_auto_add_music
            int r0 = r0.mo58779Qe(r2, r3)
            if (r0 != r3) goto L_0x009e
            boolean r0 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r0 == 0) goto L_0x009e
            r0 = 1
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 == 0) goto L_0x00a3
            r0 = 1
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 == 0) goto L_0x00ad
            j23.a r0 = r10.f316674v
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r0 = r0.f324878j
            r0.setShow(r3)
        L_0x00ad:
            if (r11 == 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            l23.g r11 = r10.f316633K
            int r1 = r11.mo86110x()
        L_0x00b6:
            l23.g r11 = r10.f316633K
            r11.mo86111y(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout.setupImageEditPlugins(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0168  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152211w() {
        /*
            r6 = this;
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            l23.t0 r1 = r6.f316635M
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r1 = r1.f327035h
            int r1 = r1.getScrollCount()
            long r1 = (long) r1
            r0.f310228r = r1
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            l23.j r1 = r6.getMultiPreviewPlugin()
            int r1 = r1.f326980w
            long r1 = (long) r1
            r0.f310227q = r1
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            com.tencent.mm.plugin.vlog.model.f0 r1 = r6.f316629G
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
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            q23.a r1 = r6.f316670r
            com.tencent.mm.plugin.vlog.model.f0 r2 = r6.f316629G
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            java.util.List r2 = r2.mo134618o()
            com.tencent.mm.plugin.vlog.model.f0 r3 = r6.f316629G
            boolean r3 = r3.f316429h
            java.lang.String r1 = r1.mo161854L(r2, r3)
            java.lang.String r2 = "TextInfo"
            r3 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310233w = r1
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            q23.a r1 = r6.f316670r
            com.tencent.mm.plugin.vlog.model.f0 r2 = r6.f316629G
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            java.util.List r2 = r2.mo134618o()
            com.tencent.mm.plugin.vlog.model.f0 r4 = r6.f316629G
            boolean r4 = r4.f316429h
            java.lang.String r1 = r1.mo161853K(r2, r4)
            java.lang.String r2 = "EmojiInfo"
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310234x = r1
            com.tencent.mm.plugin.vlog.model.f0 r0 = r6.f316629G
            boolean r0 = r0.f316429h
            if (r0 != 0) goto L_0x00b3
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            m23.c r1 = r6.f316680z
            java.lang.String r1 = r1.mo160712D()
            java.lang.String r2 = "CaptionInfo"
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310232v = r1
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            com.tencent.mm.plugin.vlog.model.f0 r1 = r6.f316629G
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.f316438t
            java.lang.String r1 = r1.mo134621r()
            java.lang.String r2 = "TransitionInfo"
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310235y = r1
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            com.tencent.mm.plugin.vlog.model.f0 r1 = r6.f316629G
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.f316438t
            java.lang.String r1 = r1.mo134620q()
            java.lang.String r2 = "TrSpeedInfo"
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310236z = r1
        L_0x00b3:
            th2.c r0 = r6.f316656b1
            com.tencent.mm.plugin.vlog.model.f0 r1 = r6.f316629G
            java.util.LinkedList<com.tencent.mm.plugin.vlog.model.q0> r1 = r1.f316428g
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00c8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00da
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.vlog.model.q0 r4 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r4
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r4 = r4.f316500k
            r2.add(r4)
            goto L_0x00c8
        L_0x00da:
            com.tencent.mm.plugin.vlog.model.f0 r1 = r6.f316629G
            boolean r1 = r1.f316429h
            r0.mo162666b(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reportEdit19904, isVideoEnhancementEnable:"
            r0.append(r1)
            boolean r1 = r6.f316660f1
            r0.append(r1)
            java.lang.String r1 = ", VideoTrackLabel:"
            r0.append(r1)
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Integer, java.lang.Long>> r1 = d23.C106976a.f320219l
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MultiVideoPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            th2.c r0 = r6.f316656b1
            boolean r1 = r6.f316660f1
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Integer, java.lang.Long>> r2 = d23.C106976a.f320219l
            r0.mo162667c(r1, r2)
            th2.c r0 = r6.f316656b1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            r0.mo86054n()
            th2.c r0 = r6.f316656b1
            r0.mo162665a()
            com.tencent.mm.plugin.vlog.model.f0 r0 = r6.f316629G
            java.util.LinkedList<com.tencent.mm.plugin.vlog.model.q0> r0 = r0.f316428g
            int r0 = r0.size()
            r1 = 0
            if (r0 != r3) goto L_0x0124
            goto L_0x013e
        L_0x0124:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r6.f316629G
            boolean r2 = r0.f316430i
            if (r2 == 0) goto L_0x012c
            r0 = 2
            goto L_0x0141
        L_0x012c:
            boolean r2 = r0.f316429h
            if (r2 == 0) goto L_0x0138
            boolean r0 = r0.mo152121r()
            if (r0 == 0) goto L_0x0138
            r0 = 1
            goto L_0x0141
        L_0x0138:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r6.f316629G
            boolean r0 = r0.f316429h
            if (r0 == 0) goto L_0x0140
        L_0x013e:
            r0 = 0
            goto L_0x0141
        L_0x0140:
            r0 = 3
        L_0x0141:
            th2.d r2 = th2.C110992d.f332425a
            q23.a r4 = r6.f316670r
            int r4 = r4.mo161847E()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "KEY_ADD_EMOJI_COUNT_INT"
            r2.mo162677k(r5, r4)
            q23.a r4 = r6.f316670r
            int r4 = r4.mo161849G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "KEY_ADD_TEXT_COUNT_INT"
            r2.mo162677k(r5, r4)
            j23.a r4 = r6.f316674v
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r4.f324881p
            if (r4 != 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r1 = 1
        L_0x0169:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "KEY_SELECT_MUSIC_INT"
            r2.mo162677k(r4, r1)
            j23.a r1 = r6.f316674v
            boolean r1 = r1.mo159392z()
            r1 = r1 ^ r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r4 = "KEY_SELECT_ORIGIN_INT"
            r2.mo162677k(r4, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "KEY_AFTER_EDIT_INT"
            r2.mo162677k(r3, r1)
            java.lang.String r1 = r6.f316652X0
            java.lang.String r3 = "KEY_MULTI_MEDIA_POST_ID_STRING"
            r2.mo162677k(r3, r1)
            java.lang.String r1 = r6.f316653Y0
            java.lang.String r3 = "KEY_MULTI_MEDIA_EDIT_ID_STRING"
            r2.mo162677k(r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "KEY_VIDEO_SUB_TYPE_INT"
            r2.mo162677k(r1, r0)
            r2.mo162672f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoPluginLayout.mo152211w():void");
    }

    /* renamed from: x */
    public final void mo152212x(long j) {
        Log.m105924i("MicroMsg.MultiVideoPluginLayout", "reportEdit20741Image, isVideoEnhancementEnable:" + this.f316660f1);
        long j2 = 1;
        long j3 = this.f316651W0 ? 1 : 4;
        C97822c cVar = new C97822c();
        ArrayList<C92007a> D = this.f316670r.mo161846D();
        MultiMediaEditResultStruct multiMediaEditResultStruct = cVar.f286970a;
        multiMediaEditResultStruct.f265739d = multiMediaEditResultStruct.mo86045b("EditId", this.f316653Y0, true);
        cVar.f286970a.f265749n = (long) NetStatusUtil.getIOSNetType(getContext());
        MultiMediaEditResultStruct multiMediaEditResultStruct2 = cVar.f286970a;
        multiMediaEditResultStruct2.f265753r = 2;
        multiMediaEditResultStruct2.f265742g = (long) this.f316629G.f316425d.size();
        cVar.f286970a.f265746k = j3;
        cVar.mo137156c(D);
        MultiMediaEditResultStruct multiMediaEditResultStruct3 = cVar.f286970a;
        multiMediaEditResultStruct3.f265745j = j;
        if (!this.f316660f1) {
            j2 = 0;
        }
        multiMediaEditResultStruct3.f265748m = j2;
        cVar.mo137154a();
    }

    /* renamed from: y */
    public final void mo152213y() {
        C106205q0 q0Var = this.f316629G.f316442x;
        if (q0Var != null) {
            C109232t0 t0Var = this.f316635M;
            int i = this.f316646U.f326861i;
            C110801c cVar = q0Var.f316501l;
            t0Var.mo160474x(i, cVar.f331464b, cVar.f331465c);
            C109202j multiPreviewPlugin = getMultiPreviewPlugin();
            C110801c cVar2 = q0Var.f316501l;
            multiPreviewPlugin.mo160455N(cVar2.f331464b, cVar2.f331465c);
            getMultiPreviewPlugin().mo160453L(q0Var.f316501l.f331464b);
        }
    }
}
