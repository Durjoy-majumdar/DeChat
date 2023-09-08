package com.tencent.p014mm.plugin.emojicapture.p841ui.capture;

import a71.C91977i;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraObservableTextureView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiCaptureGLTextureView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorItemContainer;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.p014mm.plugin.mmsight.p077ui.CameraFrontSightView;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCaptureTouchView;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCircularProgressBar;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightRecordButton;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.xlabeffect.XLabEffectSettingView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import e71.C97607d;
import f90.C107509b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g71.C8241c;
import g71.C98081a;
import g71.C98082b;
import g71.C98084e;
import g71.C98085f;
import gy3.C87412m;
import gy3.C87413o;
import h71.C98318c;
import h90.C98323a;
import h90.C98324b;
import i72.C108388k;
import j20.C117292a;
import j71.C108592j;
import j71.C108593k;
import j90.C108667e;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l90.C109291a;
import m90.C109557d;
import m90.C88716b;
import n90.C109726b;
import o40.C61926c;
import p207nl.C89008j;
import p625nu.C100196e;
import p80.C110194c;
import rh3.C101383g;
import rx3.C13598b0;
import s80.C110777a;
import sn0.C90259e;
import te3.C101814mn2;
import te3.C49978jd3;
import x61.C102566a;
import y61.C102811a;
import y61.C102812b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b,\u0010.J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer;", "Landroid/widget/RelativeLayout;", "Ly61/b;", "Ll90/a;", "Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureDecoration;", "getDecoration", "", "visibility", "Lrx3/b0;", "setVisibility", "getResolutionLimit", "Lh90/a;", "getEncodeConfig", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoTransPara", "Lj90/e;", "getCameraPreviewView", "Ls80/a;", "getRecordRenderer", "getPreviewRenderer", "Lm90/b;", "getRecorder", "getRecordScene", "Ly61/a;", "t", "Ly61/a;", "getPresenter", "()Ly61/a;", "setPresenter", "(Ly61/a;)V", "presenter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "u", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer */
public final class CaptureContainer extends RelativeLayout implements C102812b, C109291a {

    /* renamed from: v0 */
    public static final /* synthetic */ int f269218v0 = 0;

    /* renamed from: d */
    public final String f269219d;

    /* renamed from: e */
    public final ViewGroup f269220e;

    /* renamed from: f */
    public EmojiCaptureGLTextureView f269221f;

    /* renamed from: g */
    public C108592j f269222g;

    /* renamed from: h */
    public final MMSightRecordButton f269223h;

    /* renamed from: i */
    public final View f269224i;

    /* renamed from: j */
    public final View f269225j;

    /* renamed from: n */
    public final EditorStickerView f269226n;

    /* renamed from: o */
    public final View f269227o;

    /* renamed from: p */
    public final CaptureDecoration f269228p;

    /* renamed from: q */
    public final CameraFrontSightView f269229q;

    /* renamed from: r */
    public final TextView f269230r;

    /* renamed from: s */
    public final TextView f269231s;

    /* renamed from: t */
    public C102811a f269232t;

    /* renamed from: u */
    public EmojiCaptureReporter f269233u;

    /* renamed from: v */
    public C101814mn2 f269234v;

    /* renamed from: w */
    public boolean f269235w;

    /* renamed from: x */
    public final Runnable f269236x;

    /* renamed from: y */
    public C107509b f269237y;

    /* renamed from: z */
    public boolean f269238z;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$a */
    public static final class C93297a implements MMSightRecordButton.C105502i {

        /* renamed from: a */
        public final /* synthetic */ CaptureContainer f269239a;

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$a$a */
        public static final class C93298a implements MMSightCircularProgressBar.C105492a {

            /* renamed from: a */
            public final /* synthetic */ CaptureContainer f269240a;

            /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$a$a$a */
            public static final class C93299a extends C87413o implements C32226l<C98324b, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ CaptureContainer f269241d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C93299a(CaptureContainer captureContainer) {
                    super(1);
                    this.f269241d = captureContainer;
                }

                public Object invoke(Object obj) {
                    C98324b bVar = (C98324b) obj;
                    C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                    CaptureContainer.m117811e(this.f269241d, bVar);
                    return C13598b0.f38549a;
                }
            }

            public C93298a(CaptureContainer captureContainer) {
                this.f269240a = captureContainer;
            }

            /* renamed from: a */
            public void mo128042a(boolean z) {
                Log.m105924i(this.f269240a.f269219d, C90259e.C90260a.NAME);
                CaptureContainer captureContainer = this.f269240a;
                C93299a aVar = new C93299a(captureContainer);
                captureContainer.f269221f.mo148312q(new C98082b(captureContainer));
                CaptureContainer.m117812g(captureContainer, captureContainer.f269237y.mo157938l(aVar));
            }

            /* renamed from: b */
            public void mo128043b(ArrayList<Float> arrayList) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$a$b */
        public static final class C93300b extends C87413o implements C32226l<C98324b, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ CaptureContainer f269242d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C93300b(CaptureContainer captureContainer) {
                super(1);
                this.f269242d = captureContainer;
            }

            public Object invoke(Object obj) {
                C98324b bVar = (C98324b) obj;
                C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
                CaptureContainer.m117811e(this.f269242d, bVar);
                return C13598b0.f38549a;
            }
        }

        public C93297a(CaptureContainer captureContainer) {
            this.f269239a = captureContainer;
        }

        /* renamed from: a */
        public void mo128039a() {
            CaptureContainer captureContainer = this.f269239a;
            captureContainer.f269223h.mo150321i(0, 100, C91977i.f263323b * 1000, C97607d.m125783c(captureContainer), new C93298a(this.f269239a));
            CaptureContainer captureContainer2 = this.f269239a;
            captureContainer2.f269226n.setShow(false);
            C102811a aVar = captureContainer2.f269232t;
            if (aVar != null) {
                aVar.mo136690c();
            }
            if (!captureContainer2.f269237y.mo157936j(false, 0)) {
                EmojiCaptureReporter.m117777c(33, 1);
            }
            this.f269239a.f269224i.setEnabled(false);
            this.f269239a.f269224i.animate().alpha(0.0f).start();
            this.f269239a.mo128033j(false, 0);
            View view = this.f269239a.f269225j;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$1", C90259e.C90260a.NAME, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$1", C90259e.C90260a.NAME, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        /* renamed from: b */
        public void mo128040b() {
            Log.m105924i(this.f269239a.f269219d, "onPressDown");
            int[] iArr = new int[2];
            this.f269239a.f269223h.getLocationOnScreen(iArr);
            C107509b bVar = this.f269239a.f269237y;
            int i = iArr[1];
            if (bVar.f321652l == 0) {
                bVar.f321642b.mo143172k(i, 10);
            }
        }

        /* renamed from: c */
        public void mo128041c() {
            Log.m105924i(this.f269239a.f269219d, "onLongPressFinish");
            CaptureContainer captureContainer = this.f269239a;
            C93300b bVar = new C93300b(captureContainer);
            captureContainer.f269221f.mo148312q(new C98082b(captureContainer));
            CaptureContainer.m117812g(captureContainer, captureContainer.f269237y.mo157938l(bVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$b */
    public static final class C93301b implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f269243d;

        /* renamed from: e */
        public final /* synthetic */ CaptureContainer f269244e;

        public C93301b(Context context, CaptureContainer captureContainer) {
            this.f269243d = context;
            this.f269244e = captureContainer;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C104428a aVar = new C104428a(this.f269243d, 0);
            Window window = aVar.getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            XLabEffectSettingView xLabEffectSettingView = new XLabEffectSettingView(this.f269243d);
            xLabEffectSettingView.setCameraView(this.f269244e.f269221f);
            aVar.setContentView((View) xLabEffectSettingView);
            aVar.show();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$c */
    public static final class C93302c implements MMSightRecordButton.C105504k {

        /* renamed from: a */
        public final /* synthetic */ CaptureContainer f269245a;

        public C93302c(CaptureContainer captureContainer) {
            this.f269245a = captureContainer;
        }

        /* renamed from: a */
        public final void mo128045a() {
            Log.m105924i(this.f269245a.f269219d, "simpleTapCallback");
            CaptureContainer.m117812g(this.f269245a, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$d */
    public static final class C93303d implements MMSightRecordButton.C105503j {

        /* renamed from: a */
        public final /* synthetic */ CaptureContainer f269246a;

        public C93303d(CaptureContainer captureContainer) {
            this.f269246a = captureContainer;
        }

        /* renamed from: a */
        public void mo128046a(int i) {
            this.f269246a.f269237y.mo157942p(true, true, i);
        }

        /* renamed from: b */
        public void mo128047b(int i) {
            this.f269246a.f269237y.mo157942p(false, true, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$e */
    public static final class C93304e implements MMSightCaptureTouchView.C105491a {

        /* renamed from: a */
        public final /* synthetic */ CaptureContainer f269247a;

        public C93304e(CaptureContainer captureContainer) {
            this.f269247a = captureContainer;
        }

        /* renamed from: a */
        public void mo128048a() {
            this.f269247a.f269237y.mo157942p(true, false, 1);
        }

        /* renamed from: b */
        public void mo128049b() {
            this.f269247a.f269237y.mo157942p(false, false, 1);
        }

        /* renamed from: c */
        public void mo128050c() {
            C107509b bVar = this.f269247a.f269237y;
            if (bVar.f321652l == 0) {
                bVar.f321642b.mo143187y();
            }
            this.f269247a.mo128032i();
        }

        /* renamed from: e */
        public void mo128051e(float f, float f2) {
            CaptureContainer captureContainer = this.f269247a;
            captureContainer.f269237y.mo157930c(f, f2, captureContainer.f269221f.getWidth(), this.f269247a.f269221f.getHeight(), 400);
            this.f269247a.f269229q.mo129481a(f, f2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$f */
    public static final class C93305f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269248d;

        public C93305f(CaptureContainer captureContainer) {
            this.f269248d = captureContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102811a presenter = this.f269248d.getPresenter();
            if (presenter != null) {
                presenter.exit();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$g */
    public static final class C93306g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269249d;

        public C93306g(CaptureContainer captureContainer) {
            this.f269249d = captureContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f269249d.mo128032i();
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$h */
    public static final class C93307h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269250d;

        /* renamed from: e */
        public final /* synthetic */ Context f269251e;

        public C93307h(CaptureContainer captureContainer, Context context) {
            this.f269250d = captureContainer;
            this.f269251e = context;
        }

        public final void onClick(View view) {
            C49978jd3 jd32;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101814mn2 mn22 = this.f269250d.f269234v;
            if (!(mn22 == null || (jd32 = mn22.f298865g) == null)) {
                Context context = this.f269251e;
                int i = EmojiStoreV2DesignerUI.f312432w;
                Intent intent = new Intent(context, EmojiStoreV2DesignerUI.class);
                intent.putExtra("uin", jd32.f136019d);
                intent.putExtra("name", jd32.f136020e);
                intent.putExtra("headurl", jd32.f136021f);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$i */
    public static final class C93308i extends C87413o implements C32227p<C101383g, C101814mn2, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269252d;

        /* renamed from: e */
        public final /* synthetic */ Context f269253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93308i(CaptureContainer captureContainer, Context context) {
            super(2);
            this.f269252d = captureContainer;
            this.f269253e = context;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
            r0 = r6.f298865g;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                rh3.g r5 = (rh3.C101383g) r5
                te3.mn2 r6 = (te3.C101814mn2) r6
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer r0 = r4.f269252d
                y61.a r0 = r0.getPresenter()
                if (r0 == 0) goto L_0x000f
                r0.mo136688a(r5)
            L_0x000f:
                r5 = 0
                if (r6 == 0) goto L_0x0019
                te3.jd3 r0 = r6.f298865g
                if (r0 == 0) goto L_0x0019
                java.lang.String r0 = r0.f136020e
                goto L_0x001a
            L_0x0019:
                r0 = r5
            L_0x001a:
                if (r0 == 0) goto L_0x006b
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r1 != 0) goto L_0x006b
                android.content.Context r5 = r4.f269253e
                r1 = 2131824874(0x7f1110ea, float:1.9282588E38)
                java.lang.String r5 = r5.getString(r1)
                java.lang.String r1 = "context.getString(R.stri…re_sticker_designer_from)"
                gy3.C87412m.m108593f(r5, r1)
                android.text.SpannableString r1 = new android.text.SpannableString
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r5)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer r0 = r4.f269252d
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131101015(0x7f060557, float:1.7814428E38)
                int r0 = r0.getColor(r2)
                android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
                r2.<init>(r0)
                int r5 = r5.length()
                int r0 = r1.length()
                r3 = 33
                r1.setSpan(r2, r5, r0, r3)
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer r5 = r4.f269252d
                android.widget.TextView r5 = r5.f269231s
                r5.setText(r1)
                goto L_0x0072
            L_0x006b:
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer r0 = r4.f269252d
                android.widget.TextView r0 = r0.f269231s
                r0.setText(r5)
            L_0x0072:
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer r5 = r4.f269252d
                r5.f269234v = r6
                rx3.b0 r5 = rx3.C13598b0.f38549a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureContainer.C93308i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$j */
    public static final class C93309j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269254d;

        public C93309j(CaptureContainer captureContainer) {
            this.f269254d = captureContainer;
        }

        public final void run() {
            CaptureContainer captureContainer = this.f269254d;
            int i = CaptureContainer.f269218v0;
            captureContainer.mo128033j(true, C0966R.string.f360210av1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$k */
    public static final class C93310k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269255d;

        /* renamed from: e */
        public final /* synthetic */ C101383g f269256e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93310k(CaptureContainer captureContainer, C101383g gVar) {
            super(0);
            this.f269255d = captureContainer;
            this.f269256e = gVar;
        }

        public Object invoke() {
            this.f269255d.f269222g.mo138246a(this.f269256e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$l */
    public static final class C93311l implements C98323a {
        /* renamed from: b */
        public String mo128056b() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            C89008j jVar = C89008j.f256613a;
            sb4.append(C89008j.f256615c);
            sb4.append("capture_emoji/");
            String sb5 = sb4.toString();
            C86013q1.m106461v(sb5);
            sb.append(sb5);
            sb.append("temp_thumb");
            sb.append(Util.nowMilliSecond());
            return sb.toString();
        }

        /* renamed from: c */
        public int mo128057c() {
            return 2;
        }

        public String getFilePath() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            C89008j jVar = C89008j.f256613a;
            sb4.append(C89008j.f256615c);
            sb4.append("capture_emoji/");
            String sb5 = sb4.toString();
            C86013q1.m106461v(sb5);
            sb.append(sb5);
            sb.append("video_");
            sb.append(Util.nowMilliSecond());
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$m */
    public static final class C93312m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269257d;

        public C93312m(CaptureContainer captureContainer) {
            this.f269257d = captureContainer;
        }

        public final void run() {
            CaptureContainer captureContainer = this.f269257d;
            int i = CaptureContainer.f269218v0;
            captureContainer.mo128033j(false, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$n */
    public static final class C93313n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269258d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93313n(CaptureContainer captureContainer) {
            super(0);
            this.f269258d = captureContainer;
        }

        public Object invoke() {
            this.f269258d.f269222g.mo138248d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer$o */
    public static final class C93314o extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CaptureContainer f269259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93314o(CaptureContainer captureContainer) {
            super(1);
            this.f269259d = captureContainer;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            CaptureContainer captureContainer = this.f269259d;
            captureContainer.f269237y.getClass();
            C61926c.m72668M(new C8241c(C109726b.m149046a(), captureContainer));
            EditorStickerView editorStickerView = this.f269259d.f269226n;
            editorStickerView.getClass();
            C61926c.m72666K(200, new C98085f(editorStickerView));
            if (!booleanValue) {
                EmojiCaptureReporter.m117777c(9, 1);
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markCameraOpenFailed");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(1012, 3, 1);
                if (!this.f269259d.mo128017d()) {
                    Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGpuCropPreviewFailed");
                    nVar.mo175913w(1012, 8, 1);
                } else {
                    Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markCpuCropPreviewFailed");
                    nVar.mo175913w(1012, 9, 1);
                }
            }
            if (this.f269259d.mo128017d()) {
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markCpuCropPreview");
                C115669n.INSTANCE.mo175913w(1012, 7, 1);
            } else {
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGpuCropPreview");
                C115669n.INSTANCE.mo175913w(1012, 6, 1);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptureContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269219d = "MicroMsg.CaptureContainer";
        this.f269222g = new C108592j();
        this.f269236x = new C93312m(this);
        View.inflate(context, C0966R.C0971layout.f359648a12, this);
        View findViewById = findViewById(C0966R.C0970id.cek);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_capture_preview_layout)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f269220e = viewGroup;
        View findViewById2 = findViewById(C0966R.C0970id.ce9);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_capture_button)");
        MMSightRecordButton mMSightRecordButton = (MMSightRecordButton) findViewById2;
        this.f269223h = mMSightRecordButton;
        View findViewById3 = findViewById(C0966R.C0970id.f357610ar1);
        C87412m.m108593f(findViewById3, "findViewById(R.id.capture_close)");
        this.f269224i = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.ar5);
        C87412m.m108593f(findViewById4, "findViewById(R.id.capture_flip_camera)");
        this.f269225j = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.la9);
        C87412m.m108593f(findViewById5, "findViewById(R.id.voice_detect_hint)");
        this.f269227o = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.f357612ar3);
        C87412m.m108593f(findViewById6, "findViewById(R.id.capture_decoration)");
        this.f269228p = (CaptureDecoration) findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.ar6);
        C87412m.m108593f(findViewById7, "findViewById(R.id.capture_focus_frame)");
        CameraFrontSightView cameraFrontSightView = (CameraFrontSightView) findViewById7;
        this.f269229q = cameraFrontSightView;
        View findViewById8 = findViewById(C0966R.C0970id.ar9);
        C87412m.m108593f(findViewById8, "findViewById(R.id.capture_touch_view)");
        View findViewById9 = findViewById(C0966R.C0970id.ceh);
        C87412m.m108593f(findViewById9, "findViewById(R.id.emoji_capture_hint)");
        TextView textView = (TextView) findViewById9;
        this.f269230r = textView;
        View findViewById10 = findViewById(C0966R.C0970id.cem);
        C87412m.m108593f(findViewById10, "findViewById(R.id.emoji_capture_sticker_designer)");
        TextView textView2 = (TextView) findViewById10;
        this.f269231s = textView2;
        View findViewById11 = findViewById(C0966R.C0970id.ces);
        C87412m.m108593f(findViewById11, "findViewById(R.id.emoji_capture_sticker_panel)");
        EditorStickerView editorStickerView = (EditorStickerView) findViewById11;
        this.f269226n = editorStickerView;
        int b = C76577a.m92151b(context, 120);
        cameraFrontSightView.mo129482b(b, b);
        this.f269221f = new EmojiCaptureGLTextureView(context);
        C107509b bVar = new C107509b(this);
        this.f269237y = bVar;
        bVar.mo157933f(600);
        viewGroup.addView(this.f269221f);
        this.f269221f.setOpaque(false);
        mMSightRecordButton.setHighLightOuter(getResources().getColor(C0966R.color.f3323nx));
        mMSightRecordButton.setInnerColor(getResources().getColor(C0966R.color.f2932f));
        mMSightRecordButton.setLongPressCallback(new C93297a(this));
        mMSightRecordButton.setSimpleTapCallback(new C93302c(this));
        mMSightRecordButton.setLongPressScrollCallback(new C93303d(this));
        ((MMSightCaptureTouchView) findViewById8).setTouchCallback(new C93304e(this));
        findViewById3.setOnClickListener(new C93305f(this));
        findViewById4.setOnClickListener(new C93306g(this));
        textView2.setOnClickListener(new C93307h(this, context));
        editorStickerView.setSelectionCallback(new C93308i(this, context));
        editorStickerView.setVisibility(8);
        textView.setAlpha(0.0f);
        post(new C93309j(this));
        if (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) {
            findViewById3.setOnLongClickListener(new C93301b(context, this));
        }
    }

    /* renamed from: e */
    public static final void m117811e(CaptureContainer captureContainer, C98324b bVar) {
        Log.m105924i(captureContainer.f269219d, "stopRecord: videoRecorder stop");
        EmojiCaptureReporter emojiCaptureReporter = captureContainer.f269233u;
        if (emojiCaptureReporter != null) {
            emojiCaptureReporter.f269146y = captureContainer.f269238z;
        }
        captureContainer.f269237y.mo157937k();
        if (C86013q1.m106450k(bVar.f288180a) && !C86013q1.m106450k(bVar.f288181b) && !Util.isNullOrNil(bVar.f288181b)) {
            Bitmap rk = ((C100196e) C86312j.m106911c(C100196e.class)).mo139319rk(bVar.f288180a);
            String str = captureContainer.f269219d;
            Log.m105924i(str, "retry get video thumb:" + rk + ", videoPath:" + bVar.f288180a + ", thumbPath:" + bVar.f288181b);
            if (rk != null) {
                BitmapUtil.saveBitmapToImage(rk, 80, Bitmap.CompressFormat.JPEG, bVar.f288181b, true);
            }
        }
        if (!C86013q1.m106450k(bVar.f288181b)) {
            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoRecordNoThumb");
            C115669n.INSTANCE.mo175913w(1012, 11, 1);
        }
        C102811a aVar = captureContainer.f269232t;
        if (aVar != null) {
            aVar.mo136689b(bVar, captureContainer.f269238z);
        }
    }

    /* renamed from: g */
    public static final void m117812g(CaptureContainer captureContainer, boolean z) {
        if (z) {
            Log.m105924i(captureContainer.f269219d, "stopRecord true");
            captureContainer.f269223h.setTouchEnable(false);
            EditorStickerView editorStickerView = captureContainer.f269226n;
            editorStickerView.getClass();
            C61926c.m72668M(new C98084e(editorStickerView));
        } else {
            Log.m105924i(captureContainer.f269219d, "stopRecord false");
            captureContainer.mo128033j(true, C0966R.string.av5);
            captureContainer.f269226n.setShow(true);
            captureContainer.f269221f.mo148312q(new C98081a(captureContainer));
            captureContainer.f269237y.getClass();
            C61926c.m72668M(new C8241c(C109726b.m149046a(), captureContainer));
            EditorStickerView editorStickerView2 = captureContainer.f269226n;
            editorStickerView2.getClass();
            C61926c.m72666K(200, new C98085f(editorStickerView2));
        }
        captureContainer.f269224i.setEnabled(true);
        captureContainer.f269224i.animate().cancel();
        View view = captureContainer.f269224i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(1.0f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "recordStop", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "recordStop", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: a */
    public void mo128014a(C101383g gVar) {
        this.f269228p.setStickerInfo(gVar);
        this.f269221f.mo148312q(new C93310k(this, gVar));
    }

    /* renamed from: b */
    public boolean mo128015b() {
        return true;
    }

    /* renamed from: c */
    public void mo128016c(boolean z) {
        if (z) {
            View view = this.f269227o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f269227o;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "toggleVoiceDetect", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: d */
    public boolean mo128017d() {
        return ((C102566a.C102567a) C102566a.f302002b.mo138761d()).f302005b;
    }

    /* renamed from: f */
    public boolean mo128018f() {
        EmojiCaptureProxy.C93278a aVar = EmojiCaptureProxy.f269148h;
        return EmojiCaptureProxy.f269149i.getEnableAutoRotate();
    }

    public C108667e getCameraPreviewView() {
        return this.f269221f;
    }

    public VideoTransPara getDaemonVideoTransPara() {
        return getVideoTransPara();
    }

    public CaptureDecoration getDecoration() {
        return this.f269228p;
    }

    public C98323a getEncodeConfig() {
        return new C93311l();
    }

    public final C102811a getPresenter() {
        return this.f269232t;
    }

    public C110777a getPreviewRenderer() {
        return this.f269222g;
    }

    public C110777a getRecordRenderer() {
        C108593k kVar = new C108593k();
        int i = C91977i.f263324c;
        kVar.mo159591u(i, i);
        return kVar;
    }

    public int getRecordScene() {
        return 8;
    }

    public C88716b getRecorder() {
        C110777a recordRenderer = getRecordRenderer();
        VideoTransPara videoTransPara = getVideoTransPara();
        EGLContext eGLContext = getCameraPreviewView().getEGLContext();
        C87412m.m108591d(eGLContext);
        C110194c previewTexture = this.f269221f.getPreviewTexture();
        return new C109557d(videoTransPara, recordRenderer, eGLContext, previewTexture != null ? previewTexture.f329652e : -1);
    }

    public final EmojiCaptureReporter getReporter() {
        return this.f269233u;
    }

    public int getResolutionLimit() {
        return ((C102566a.C102567a) C102566a.f302002b.mo138761d()).f302004a;
    }

    public VideoTransPara getVideoTransPara() {
        VideoTransPara videoTransPara = C108388k.f324540d.f324552b;
        return videoTransPara != null ? videoTransPara : new VideoTransPara();
    }

    /* renamed from: h */
    public void mo128031h() {
        Log.m105924i(this.f269219d, "resumeCapture");
        mo128016c(false);
        if (this.f269235w) {
            this.f269226n.setShow(true);
        }
        CaptureDecoration decoration = getDecoration();
        EditorItemContainer editorItemContainer = decoration.f269262v;
        int childCount = editorItemContainer.f269359g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = editorItemContainer.f269359g.getChildAt(i);
            if (childAt instanceof C98318c) {
                ((C98318c) childAt).resume();
            }
        }
        decoration.f269263w.mo149565a();
        this.f269221f.mo148312q(new C93313n(this));
        C107509b.m145625i(this.f269237y, this.f269238z, (Float) null, new C93314o(this), 2, (Object) null);
    }

    /* renamed from: i */
    public boolean mo128032i() {
        this.f269238z = this.f269237y.mo157939m(false);
        EmojiCaptureReporter emojiCaptureReporter = this.f269233u;
        EmojiCaptureReporter.m117776b(5, emojiCaptureReporter != null ? emojiCaptureReporter.f269128d : 0, 0, 0, 0, 0, 0, 0, 0, emojiCaptureReporter != null ? emojiCaptureReporter.f269127G : 0);
        return this.f269238z;
    }

    /* renamed from: j */
    public final void mo128033j(boolean z, int i) {
        if (z) {
            if (((float) this.f269230r.getTop()) < getResources().getDimension(C0966R.dimen.a3d) + getResources().getDimension(C0966R.dimen.ajp) + getResources().getDimension(C0966R.dimen.a3e) + getResources().getDimension(C0966R.dimen.a3f) + ((float) C76577a.m92151b(getContext(), 30))) {
                this.f269230r.setBackgroundResource(C0966R.C0969drawable.emoji_capture_hint_bg);
            }
            removeCallbacks(this.f269236x);
            this.f269230r.animate().cancel();
            this.f269230r.animate().alpha(1.0f).start();
            this.f269230r.setText(i);
            postDelayed(this.f269236x, 2000);
            return;
        }
        this.f269230r.animate().cancel();
        this.f269230r.animate().alpha(0.0f).start();
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets != null) {
            findViewById(C0966R.C0970id.ceg).setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
        }
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        C87412m.m108593f(onApplyWindowInsets, "super.onApplyWindowInsets(insets)");
        return onApplyWindowInsets;
    }

    public final void setPresenter(C102811a aVar) {
        this.f269232t = aVar;
    }

    public final void setReporter(EmojiCaptureReporter emojiCaptureReporter) {
        this.f269233u = emojiCaptureReporter;
    }

    public void setVisibility(int i) {
        String str = this.f269219d;
        Log.m105924i(str, "setVisibility:" + i);
        super.setVisibility(i);
        View view = this.f269224i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i == 0) {
            this.f269223h.setTouchEnable(true);
            EditorStickerView editorStickerView = this.f269226n;
            editorStickerView.getClass();
            C61926c.m72666K(200, new C98085f(editorStickerView));
        }
        if (i == 8) {
            this.f269221f.setTextureChangeCallback((CameraObservableTextureView.C92700a) null);
            this.f269220e.removeView(this.f269221f);
            EmojiCaptureGLTextureView emojiCaptureGLTextureView = new EmojiCaptureGLTextureView(getContext());
            this.f269221f = emojiCaptureGLTextureView;
            this.f269220e.addView(emojiCaptureGLTextureView);
            C108592j jVar = new C108592j();
            this.f269222g = jVar;
            this.f269221f.mo148309j(jVar, mo128017d());
            this.f269221f.setOpaque(false);
        }
        this.f269221f.setVisibility(i);
    }

    /* renamed from: v */
    public boolean mo128038v() {
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptureContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
