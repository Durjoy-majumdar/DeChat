package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import ac3.C103355g1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Switch;
import c30.C104289g;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f90.C107509b;
import fh2.C97877b;
import fh2.C97884j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C98453h;
import i21.C60242i;
import i72.C108389l;
import i72.C98607d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k21.C60960c;
import kg3.C76577a;
import kotlin.Metadata;
import lh2.C109344g0;
import lh2.C109360o0;
import lh2.C34278s0;
import lh2.C99450m0;
import lh2.C99457n0;
import lh2.C99466t0;
import lh2.C99467u0;
import lh2.C99473x0;
import m90.C88716b;
import nj3.C76879j;
import p447aw.C103918d;
import p625nu.C61901d;
import qh2.C101198e;
import qh2.C101200h;
import rx3.C13598b0;
import sf0.C90188n0;
import sh2.C110790c;
import sx3.C110818d0;
import sx3.C64197v;
import th2.C101891f;
import th2.C110992d;
import w80.C102361h;
import wg2.C102440a;
import xb0.C102609h;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0004X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "Lnu/d$a;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "h", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "getPreviewPlugin", "()Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "previewPlugin", "Llh2/o0;", "i", "Llh2/o0;", "getRecordPlugin", "()Llh2/o0;", "recordPlugin", "Lf90/b;", "s", "Lf90/b;", "getRecordController", "()Lf90/b;", "setRecordController", "(Lf90/b;)V", "recordController", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "u", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Li72/d;", "v", "Li72/d;", "getOrientationEventListener", "()Li72/d;", "setOrientationEventListener", "(Li72/d;)V", "orientationEventListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout */
public class RecordPluginLayout extends BasePluginLayout implements C101198e, C61901d.C61902a {

    /* renamed from: x */
    public static final /* synthetic */ int f272980x = 0;

    /* renamed from: h */
    public final CameraPreviewGLSurfaceView f272981h;

    /* renamed from: i */
    public final C109360o0 f272982i;

    /* renamed from: j */
    public final C99466t0 f272983j;

    /* renamed from: n */
    public final C99450m0 f272984n;

    /* renamed from: o */
    public final C99473x0 f272985o;

    /* renamed from: p */
    public final C99457n0 f272986p;

    /* renamed from: q */
    public final C99467u0 f272987q;

    /* renamed from: r */
    public C97877b f272988r;

    /* renamed from: s */
    public C107509b f272989s;

    /* renamed from: t */
    public C102440a f272990t;

    /* renamed from: u */
    public RecordConfigProvider f272991u;

    /* renamed from: v */
    public C98607d f272992v;

    /* renamed from: w */
    public boolean f272993w;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$a */
    public static final class C94412a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RecordPluginLayout f272994a;

        public C94412a(RecordPluginLayout recordPluginLayout) {
            this.f272994a = recordPluginLayout;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            compoundButton.setVisibility(0);
            C107509b recordController = this.f272994a.getRecordController();
            if (recordController != null) {
                recordController.mo157940n("cameraeffect.request.facebeauty", z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$b */
    public static final class C94413b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RecordPluginLayout f272995a;

        public C94413b(RecordPluginLayout recordPluginLayout) {
            this.f272995a = recordPluginLayout;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            compoundButton.setVisibility(0);
            if (((Switch) this.f272995a.findViewById(C0966R.C0970id.etz)).isChecked() && z) {
                ((Switch) this.f272995a.findViewById(C0966R.C0970id.etz)).setChecked(false);
            }
            C107509b recordController = this.f272995a.getRecordController();
            if (recordController != null) {
                recordController.mo157940n("cameraeffect.request.denois", z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$c */
    public static final class C94414c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RecordPluginLayout f272996a;

        public C94414c(RecordPluginLayout recordPluginLayout) {
            this.f272996a = recordPluginLayout;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            compoundButton.setVisibility(0);
            C107509b recordController = this.f272996a.getRecordController();
            if (recordController != null) {
                recordController.mo157940n("cameraeffect.request.hdrchecker", z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$d */
    public static final class C94415d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RecordPluginLayout f272997a;

        public C94415d(RecordPluginLayout recordPluginLayout) {
            this.f272997a = recordPluginLayout;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            compoundButton.setVisibility(0);
            if (((Switch) this.f272997a.findViewById(C0966R.C0970id.f357844c21)).isChecked() && z) {
                ((Switch) this.f272997a.findViewById(C0966R.C0970id.f357844c21)).setChecked(false);
            }
            C107509b recordController = this.f272997a.getRecordController();
            if (recordController != null) {
                recordController.mo157940n("cameraeffect.request.hdr", z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$e */
    public static final class C94416e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ RecordPluginLayout f272998a;

        public C94416e(RecordPluginLayout recordPluginLayout) {
            this.f272998a = recordPluginLayout;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            compoundButton.setVisibility(0);
            C107509b recordController = this.f272998a.getRecordController();
            if (recordController != null) {
                recordController.mo157940n("cameraeffect.request.stabilization", z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$f */
    public static final class C94417f extends C87413o implements C32227p<String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f272999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94417f(RecordPluginLayout recordPluginLayout) {
            super(2);
            this.f272999d = recordPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(str, "tag");
            C107509b recordController = this.f272999d.getRecordController();
            if (recordController != null) {
                recordController.f321642b.mo143165e(str, intValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$g */
    public static final class C94418g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f273000d;

        /* renamed from: e */
        public final /* synthetic */ RecordPluginLayout f273001e;

        public C94418g(Context context, RecordPluginLayout recordPluginLayout) {
            this.f273000d = context;
            this.f273001e = recordPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C104428a aVar = new C104428a(this.f273000d, 0);
            Window window = aVar.getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Context context = this.f273000d;
            C87412m.m108594g(context, "context");
            VendorEffectSettingView vendorEffectSettingView = new VendorEffectSettingView(context, (AttributeSet) null);
            vendorEffectSettingView.setCameraView(this.f273001e.getPreviewPlugin());
            aVar.setContentView((View) vendorEffectSettingView);
            aVar.show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$h */
    public static final class C94419h extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f273002d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94419h(RecordPluginLayout recordPluginLayout) {
            super(1);
            this.f273002d = recordPluginLayout;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                ((Switch) this.f273002d.findViewById(C0966R.C0970id.etz)).setChecked(true);
                ((Switch) this.f273002d.findViewById(C0966R.C0970id.f357844c21)).setChecked(false);
            } else {
                ((Switch) this.f273002d.findViewById(C0966R.C0970id.etz)).setChecked(false);
                ((Switch) this.f273002d.findViewById(C0966R.C0970id.f357844c21)).setChecked(true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$i */
    public static final class C94420i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f273003d;

        public C94420i(RecordPluginLayout recordPluginLayout) {
            this.f273003d = recordPluginLayout;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f273003d.f272993w = true;
            Context context = this.f273003d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$j */
    public static final class C94421j implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f273004d;

        public C94421j(RecordPluginLayout recordPluginLayout) {
            this.f273004d = recordPluginLayout;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            RecordPluginLayout recordPluginLayout = this.f273004d;
            int i2 = RecordPluginLayout.f272980x;
            recordPluginLayout.mo129869m(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$k */
    public static final class C94422k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f273005d;

        public C94422k(RecordPluginLayout recordPluginLayout) {
            this.f273005d = recordPluginLayout;
        }

        public final void run() {
            RecordConfigProvider configProvider = this.f273005d.getConfigProvider();
            String str = null;
            if (configProvider != null ? C87412m.m108589b(configProvider.f272933u, Boolean.TRUE) : false) {
                RecordConfigProvider configProvider2 = this.f273005d.getConfigProvider();
                C86013q1.m106447h(configProvider2 != null ? configProvider2.f272900A : null);
            }
            RecordConfigProvider configProvider3 = this.f273005d.getConfigProvider();
            if (configProvider3 != null) {
                str = configProvider3.f272903D;
            }
            C86013q1.m106447h(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$l */
    public /* synthetic */ class C94423l extends C24565l implements C32226l<C98324b, C13598b0> {
        public C94423l(Object obj) {
            super(1, obj, RecordPluginLayout.class, "onStopRecord", "onStopRecord(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", 0);
        }

        public Object invoke(Object obj) {
            String str;
            C98324b bVar = (C98324b) obj;
            C87412m.m108594g(bVar, "p0");
            RecordPluginLayout recordPluginLayout = (RecordPluginLayout) this.receiver;
            int i = RecordPluginLayout.f272980x;
            recordPluginLayout.getClass();
            Log.m105918d("MicroMsg.RecordPluginLayout", "onStopRecord, capture:" + bVar);
            C110992d dVar = C110992d.f332425a;
            C107509b bVar2 = recordPluginLayout.f272989s;
            boolean z = false;
            dVar.mo162677k("KEY_MEDIA_SOURCE_INT", Integer.valueOf(bVar2 != null && bVar2.f321646f ? 2 : 1));
            int i2 = bVar.f288184e - bVar.f288183d;
            RecordConfigProvider recordConfigProvider = recordPluginLayout.f272991u;
            int i3 = recordConfigProvider != null ? recordConfigProvider.f272936x : 0;
            C104289g gVar = null;
            if (recordConfigProvider != null && recordConfigProvider.f272905F == 14) {
                C107509b bVar3 = recordPluginLayout.f272989s;
                if (bVar3 != null) {
                    C88716b bVar4 = bVar3.f321643c;
                    str = bVar4 != null ? bVar4.getFilePath() : null;
                    if (str == null) {
                        str = "";
                    }
                } else {
                    str = null;
                }
                Log.m105924i("MicroMsg.RecordPluginLayout", "music scene stop duration not enough, videoPath:" + str + ", fileExist:" + C86013q1.m106450k(str));
                C98453h.f288774a.mo137815m(str);
                if (i2 >= i3 || i3 <= 0) {
                    C102440a aVar = recordPluginLayout.f272990t;
                    if (aVar != null) {
                        aVar.mo142012b(2, bVar);
                    }
                } else {
                    C109360o0 o0Var = recordPluginLayout.f272982i;
                    RecordConfigProvider recordConfigProvider2 = recordPluginLayout.f272991u;
                    int i4 = recordConfigProvider2 != null ? recordConfigProvider2.f272936x : 1000;
                    Context context = o0Var.f327380f.getContext();
                    C76879j.m92754y(context, context.getString(C0966R.string.huo, new Object[]{Integer.valueOf((int) (((float) i4) / 1000.0f))}), "", context.getString(C0966R.string.huj), C34278s0.f92394d);
                    C107509b bVar5 = recordPluginLayout.f272989s;
                    if (bVar5 != null) {
                        bVar5.mo157932e();
                    }
                    recordPluginLayout.f272982i.reset();
                }
            } else {
                C102440a aVar2 = recordPluginLayout.f272990t;
                if (aVar2 != null) {
                    aVar2.mo142012b(2, bVar);
                }
            }
            C102361h hVar = C102361h.f301459a;
            String str2 = bVar.f288180a;
            RecordConfigProvider recordConfigProvider3 = recordPluginLayout.f272991u;
            int i5 = -1;
            hVar.mo141930a(str2, recordConfigProvider3 != null ? recordConfigProvider3.f272922g : 1, recordConfigProvider3 != null ? recordConfigProvider3.f272921f : -1);
            String str3 = bVar.f288180a;
            RecordConfigProvider recordConfigProvider4 = recordPluginLayout.f272991u;
            int i6 = recordConfigProvider4 != null ? recordConfigProvider4.f272922g : 1;
            if (recordConfigProvider4 != null) {
                i5 = recordConfigProvider4.f272905F;
            }
            C108389l.m146846g(str3, i6, i5);
            StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
            storyDoPublishStruct.f310297j = (long) (bVar.f288184e - bVar.f288183d);
            C107509b bVar6 = recordPluginLayout.f272989s;
            if (bVar6 != null && bVar6.f321646f) {
                z = true;
            }
            storyDoPublishStruct.f310298k = z ? 2 : 1;
            C101891f fVar = C101891f.f300035a;
            if (bVar6 != null) {
                gVar = bVar6.f321661u;
            }
            fVar.mo141371e(gVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$m */
    public static final class C94424m extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f273006d;

        /* renamed from: e */
        public final /* synthetic */ RecordPluginLayout f273007e;

        /* renamed from: f */
        public final /* synthetic */ float f273008f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94424m(long j, RecordPluginLayout recordPluginLayout, float f) {
            super(1);
            this.f273006d = j;
            this.f273007e = recordPluginLayout;
            this.f273008f = f;
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x014c  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0164  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                long r2 = r0.f273006d
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "photo time cost : "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.RecordPluginLayout"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r12 = 985(0x3d9, double:4.867E-321)
                r14 = 120(0x78, double:5.93E-322)
                r16 = 1
                r18 = 0
                r11 = r4
                r11.idkeyStat(r12, r14, r16, r18)
                r5 = 985(0x3d9, double:4.867E-321)
                r7 = 122(0x7a, double:6.03E-322)
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)
                r2 = 0
                r4 = 1
                if (r1 == 0) goto L_0x01e5
                com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout r5 = r0.f273007e
                float r6 = r0.f273008f
                f90.b r7 = r5.getRecordController()
                if (r7 == 0) goto L_0x004a
                r7.mo157937k()
            L_0x004a:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "orientation : "
                r7.append(r8)
                r7.append(r6)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                java.lang.Class<h81.h> r7 = h81.C32735h.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                h81.h r7 = (h81.C32735h) r7
                h81.h$c r8 = h81.C32735h.C32737c.clicfg_photo_align_long_side
                boolean r7 = r7.mo58784wf(r8, r4)
                gj.b0 r8 = p156gj.C107835h0.f322852i
                int r8 = r8.f322646B
                r9 = -1
                if (r8 == r9) goto L_0x007b
                if (r8 != 0) goto L_0x0078
                r7 = 0
                goto L_0x007b
            L_0x0078:
                if (r8 != r4) goto L_0x007b
                r7 = 1
            L_0x007b:
                java.lang.String r8 = "rotate(it, orientation)"
                java.lang.String r9 = "rotateAndScale(temImage,…rientation, scale, scale)"
                r10 = 0
                if (r7 == 0) goto L_0x00e3
                r7 = 1156579328(0x44f00000, float:1920.0)
                int r11 = r1.getHeight()
                int r12 = r1.getWidth()
                if (r11 <= r12) goto L_0x00ba
                int r11 = r1.getHeight()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x00a8
                int r8 = r1.getHeight()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0140
            L_0x00a8:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x00ae
                r7 = 1
                goto L_0x00af
            L_0x00ae:
                r7 = 0
            L_0x00af:
                if (r7 != 0) goto L_0x013f
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0140
            L_0x00ba:
                int r11 = r1.getWidth()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x00d2
                int r8 = r1.getWidth()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0140
            L_0x00d2:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x00d8
                r7 = 1
                goto L_0x00d9
            L_0x00d8:
                r7 = 0
            L_0x00d9:
                if (r7 != 0) goto L_0x013f
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0140
            L_0x00e3:
                r7 = 1149698048(0x44870000, float:1080.0)
                int r11 = r1.getHeight()
                int r12 = r1.getWidth()
                if (r11 <= r12) goto L_0x0117
                int r11 = r1.getWidth()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x0106
                int r8 = r1.getWidth()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0140
            L_0x0106:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x010c
                r7 = 1
                goto L_0x010d
            L_0x010c:
                r7 = 0
            L_0x010d:
                if (r7 != 0) goto L_0x013f
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0140
            L_0x0117:
                int r11 = r1.getHeight()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x012e
                int r8 = r1.getHeight()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0140
            L_0x012e:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x0134
                r7 = 1
                goto L_0x0135
            L_0x0134:
                r7 = 0
            L_0x0135:
                if (r7 != 0) goto L_0x013f
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0140
            L_0x013f:
                r7 = r1
            L_0x0140:
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r10 = 1119092736(0x42b40000, float:90.0)
                int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r10 != 0) goto L_0x014c
                r10 = 1
                goto L_0x014d
            L_0x014c:
                r10 = 0
            L_0x014d:
                if (r10 != 0) goto L_0x015d
                r10 = 1132920832(0x43870000, float:270.0)
                int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r6 != 0) goto L_0x0157
                r6 = 1
                goto L_0x0158
            L_0x0157:
                r6 = 0
            L_0x0158:
                if (r6 == 0) goto L_0x015b
                goto L_0x015d
            L_0x015b:
                r6 = 0
                goto L_0x015e
            L_0x015d:
                r6 = 1
            L_0x015e:
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r10 = r5.getConfigProvider()
                if (r10 == 0) goto L_0x01e5
                r11 = 100
                android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r13 = r10.f272903D     // Catch:{ IOException -> 0x01c9 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r11, r12, r13, r4)     // Catch:{ IOException -> 0x01c9 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01c9 }
                r7.<init>()     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r11 = "save picture in "
                r7.append(r11)     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r11 = r10.f272903D     // Catch:{ IOException -> 0x01c9 }
                r7.append(r11)     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r11 = "  cost: "
                r7.append(r11)     // Catch:{ IOException -> 0x01c9 }
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)     // Catch:{ IOException -> 0x01c9 }
                r7.append(r8)     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x01c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r3 = r10.f272903D     // Catch:{ IOException -> 0x01c9 }
                java.lang.String r7 = "this.inputPhotoPath"
                gy3.C87412m.m108593f(r3, r7)     // Catch:{ IOException -> 0x01c9 }
                h90.b r7 = new h90.b     // Catch:{ IOException -> 0x01c9 }
                r12 = 0
                r13 = 0
                r14 = 1
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 65019(0xfdfb, float:9.1111E-41)
                r29 = 0
                r11 = r7
                r21 = r3
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x01c9 }
                r7.f288192m = r6     // Catch:{ IOException -> 0x01c9 }
                wg2.a r3 = r5.f272990t     // Catch:{ IOException -> 0x01c9 }
                if (r3 == 0) goto L_0x01e5
                r3.mo142012b(r4, r7)     // Catch:{ IOException -> 0x01c9 }
                goto L_0x01e5
            L_0x01c9:
                f90.b r8 = r5.getRecordController()
                if (r8 == 0) goto L_0x01d8
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 7
                r13 = 0
                f90.C107509b.m145625i(r8, r9, r10, r11, r12, r13)
            L_0x01d8:
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r15 = 985(0x3d9, double:4.867E-321)
                r17 = 130(0x82, double:6.4E-322)
                r19 = 1
                r21 = 0
                r14.idkeyStat(r15, r17, r19, r21)
            L_0x01e5:
                th2.d r3 = th2.C110992d.f332425a
                com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout r5 = r0.f273007e
                f90.b r5 = r5.getRecordController()
                if (r5 == 0) goto L_0x01f4
                boolean r5 = r5.f321646f
                if (r5 != r4) goto L_0x01f4
                r2 = 1
            L_0x01f4:
                if (r2 == 0) goto L_0x01f7
                r4 = 2
            L_0x01f7:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.String r4 = "KEY_MEDIA_SOURCE_INT"
                r3.mo162677k(r4, r2)
                th2.f r2 = th2.C101891f.f300035a
                com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout r3 = r0.f273007e
                f90.b r3 = r3.getRecordController()
                if (r3 == 0) goto L_0x020d
                c30.g r3 = r3.f321661u
                goto L_0x020e
            L_0x020d:
                r3 = 0
            L_0x020e:
                r2.mo141371e(r3)
                if (r1 != 0) goto L_0x021f
                com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r5 = 985(0x3d9, double:4.867E-321)
                r7 = 121(0x79, double:6.0E-322)
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)
            L_0x021f:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.C94424m.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$n */
    public static final class C94425n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f273009d;

        /* renamed from: e */
        public final /* synthetic */ C110790c f273010e;

        /* renamed from: f */
        public final /* synthetic */ boolean f273011f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94425n(RecordPluginLayout recordPluginLayout, C110790c cVar, boolean z) {
            super(0);
            this.f273009d = recordPluginLayout;
            this.f273010e = cVar;
            this.f273011f = z;
        }

        public Object invoke() {
            XEffectConfig xEffectConfig;
            C110790c cVar;
            RecordConfigProvider configProvider = this.f273009d.getConfigProvider();
            if (!(configProvider == null || (xEffectConfig = configProvider.f272915Q) == null || (cVar = this.f273010e) == null)) {
                cVar.f331429x = xEffectConfig;
                C103355g1 g1Var = cVar.f331427v;
                if (g1Var != null) {
                    g1Var.mo143252s(xEffectConfig);
                }
            }
            C110790c cVar2 = this.f273010e;
            if (cVar2 != null) {
                boolean z = this.f273011f;
                C103355g1 g1Var2 = cVar2.f331427v;
                if (g1Var2 != null) {
                    g1Var2.mo143229I(z);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$o */
    public static final class C94426o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110790c f273012d;

        /* renamed from: e */
        public final /* synthetic */ boolean f273013e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94426o(C110790c cVar, boolean z) {
            super(0);
            this.f273012d = cVar;
            this.f273013e = z;
        }

        public Object invoke() {
            C103355g1 g1Var;
            C110790c cVar = this.f273012d;
            if (!(cVar == null || (g1Var = cVar.f331427v) == null)) {
                g1Var.mo143228H(this.f273013e, 100);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$p */
    public static final class C94427p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RecordPluginLayout f273014d;

        public C94427p(RecordPluginLayout recordPluginLayout) {
            this.f273014d = recordPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f273014d.f272993w = true;
            Context context = this.f273014d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x00ea, code lost:
        r12 = r12.f322675x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00f3, code lost:
        if (r1 != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecordPluginLayout(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r11, r0)
            r10.<init>(r11, r12)
            i72.d r12 = new i72.d
            r0 = 2
            r12.<init>(r11, r0)
            r10.f272992v = r12
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r11)
            r0 = 2131497115(0x7f0c109b, float:1.8617814E38)
            r1 = 1
            r12.inflate(r0, r10, r1)
            r12 = 2131311270(0x7f093aa6, float:1.8240876E38)
            android.view.View r12 = r10.findViewById(r12)
            java.lang.String r0 = "findViewById(R.id.preview_plugin)"
            gy3.C87412m.m108593f(r12, r0)
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r12 = (com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView) r12
            r10.f272981h = r12
            lh2.o0 r0 = new lh2.o0
            r2 = 2131311998(0x7f093d7e, float:1.8242352E38)
            android.view.View r2 = r10.findViewById(r2)
            java.lang.String r3 = "findViewById(R.id.record_plugin)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r0.<init>(r2, r10)
            r10.f272982i = r0
            lh2.t0 r2 = new lh2.t0
            r3 = 2131299730(0x7f090d92, float:1.821747E38)
            android.view.View r3 = r10.findViewById(r3)
            java.lang.String r4 = "findViewById(R.id.close_plugin)"
            gy3.C87412m.m108593f(r3, r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r2.<init>(r3, r10)
            r10.f272983j = r2
            lh2.x0 r3 = new lh2.x0
            r4 = 2131314768(0x7f094850, float:1.824797E38)
            android.view.View r4 = r10.findViewById(r4)
            java.lang.String r5 = "findViewById(R.id.switch_camera)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.<init>(r4, r10)
            r10.f272985o = r3
            lh2.v0 r4 = new lh2.v0
            r4.<init>(r10, r10)
            lh2.m0 r5 = new lh2.m0
            r6 = 2131314427(0x7f0946fb, float:1.8247279E38)
            android.view.View r6 = r10.findViewById(r6)
            java.lang.String r7 = "findViewById(R.id.story_choose_from_album)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.<init>(r6, r10)
            r10.f272984n = r5
            lh2.n0 r6 = new lh2.n0
            r7 = 2131311961(0x7f093d59, float:1.8242277E38)
            android.view.View r7 = r10.findViewById(r7)
            java.lang.String r8 = "findViewById(R.id.record_beautify)"
            gy3.C87412m.m108593f(r7, r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            r6.<init>(r7, r10, r12)
            r10.f272986p = r6
            lh2.u0 r12 = new lh2.u0
            r7 = 2131311976(0x7f093d68, float:1.8242307E38)
            android.view.View r7 = r10.findViewById(r7)
            java.lang.String r8 = "findViewById(R.id.record_filter)"
            gy3.C87412m.m108593f(r7, r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r12.<init>(r7, r10)
            r10.f272987q = r12
            java.util.ArrayList r7 = r10.getPluginList()
            r7.add(r0)
            java.util.ArrayList r0 = r10.getPluginList()
            r0.add(r2)
            java.util.ArrayList r0 = r10.getPluginList()
            r0.add(r5)
            java.util.ArrayList r0 = r10.getPluginList()
            r0.add(r3)
            java.util.ArrayList r0 = r10.getPluginList()
            r0.add(r4)
            java.util.ArrayList r0 = r10.getPluginList()
            r0.add(r6)
            java.util.ArrayList r0 = r10.getPluginList()
            r0.add(r12)
            boolean r12 = sf0.C90188n0.f258921O
            r0 = 0
            if (r12 != 0) goto L_0x00f5
            int[] r12 = n90.C109726b.f328435a
            gj.b0 r12 = p156gj.C107835h0.f322852i
            if (r12 == 0) goto L_0x00f2
            int r12 = r12.f322675x
            r2 = -1
            if (r12 == r2) goto L_0x00f2
            if (r12 != r1) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r1 = 0
        L_0x00f3:
            if (r1 == 0) goto L_0x01b3
        L_0x00f5:
            r12 = 2131298608(0x7f090930, float:1.8215194E38)
            android.view.View r12 = r10.findViewById(r12)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout"
            java.lang.String r4 = "<init>"
            java.lang.String r5 = "(Landroid/content/Context;Landroid/util/AttributeSet;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r12
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r12.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/recordvideo/plugin/parent/RecordPluginLayout"
            java.lang.String r3 = "<init>"
            java.lang.String r4 = "(Landroid/content/Context;Landroid/util/AttributeSet;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r12
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r12 = 2131301949(0x7f09163d, float:1.822197E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Switch r12 = (android.widget.Switch) r12
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$a r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$a
            r1.<init>(r10)
            r12.setOnCheckedChangeListener(r1)
            r12 = 2131300827(0x7f0911db, float:1.8219695E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Switch r12 = (android.widget.Switch) r12
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$b r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$b
            r1.<init>(r10)
            r12.setOnCheckedChangeListener(r1)
            r12 = 2131305874(0x7f092592, float:1.8229931E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Switch r12 = (android.widget.Switch) r12
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$c r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$c
            r1.<init>(r10)
            r12.setOnCheckedChangeListener(r1)
            r12 = 2131305873(0x7f092591, float:1.822993E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Switch r12 = (android.widget.Switch) r12
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$d r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$d
            r1.<init>(r10)
            r12.setOnCheckedChangeListener(r1)
            r12 = 2131301390(0x7f09140e, float:1.8220837E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Switch r12 = (android.widget.Switch) r12
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$e r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$e
            r1.<init>(r10)
            r12.setOnCheckedChangeListener(r1)
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$f r12 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$f
            r12.<init>(r10)
            b90.C92211a.f263933e = r12
            r12 = 2131297712(0x7f0905b0, float:1.8213377E38)
            android.view.View r1 = r10.findViewById(r12)
            android.widget.Button r1 = (android.widget.Button) r1
            r1.setVisibility(r0)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$g r0 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$g
            r0.<init>(r11, r10)
            r12.setOnClickListener(r0)
        L_0x01b3:
            i72.d r11 = r10.f272992v
            if (r11 == 0) goto L_0x01b9
            r11.f289116g = r10
        L_0x01b9:
            if (r11 == 0) goto L_0x01be
            r11.enable()
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final RecordConfigProvider getConfigProvider() {
        return this.f272991u;
    }

    public final C98607d getOrientationEventListener() {
        return this.f272992v;
    }

    public final CameraPreviewGLSurfaceView getPreviewPlugin() {
        return this.f272981h;
    }

    public final C107509b getRecordController() {
        return this.f272989s;
    }

    public final C109360o0 getRecordPlugin() {
        return this.f272982i;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C107509b bVar;
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        boolean z = true;
        boolean z2 = false;
        if (C64197v.m75537f(1, 2, 4).contains(Integer.valueOf(recordConfigProvider.f272905F))) {
            if (recordConfigProvider.f272926n == null) {
                recordConfigProvider.f272926n = new SightParams(recordConfigProvider.f272905F, 0).f248452f;
            }
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            if (videoTransPara != null) {
                Log.m105924i("MicroMsg.RecordPluginLayout", "initLogic init SightRecordConfig ");
                C97884j.f287164a.mo137210c(videoTransPara, recordConfigProvider.f272905F, true);
                if (videoTransPara.f267164K == 1) {
                    C101891f.f300035a.mo141372f(1);
                } else if (videoTransPara.f267163J == 1) {
                    C101891f.f300035a.mo141372f(2);
                }
            }
        }
        this.f272990t = aVar;
        this.f272991u = recordConfigProvider;
        this.f272988r = new C97877b(recordConfigProvider, this.f272981h);
        if (!recordConfigProvider.f272932t.booleanValue()) {
            Log.m105924i("MicroMsg.RecordPluginLayout", "jump check audio permission");
        } else {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
            Log.m105924i("MicroMsg.RecordPluginLayout", "checkAudioPermission " + z1 + " !");
            C97877b bVar2 = this.f272988r;
            if (bVar2 != null) {
                bVar2.f287123i = !z1;
            }
        }
        C97877b bVar3 = this.f272988r;
        C87412m.m108591d(bVar3);
        C107509b bVar4 = new C107509b(bVar3);
        this.f272989s = bVar4;
        if (recordConfigProvider.f272905F == 11) {
            long j = ((long) C102609h.Fx0().Gu0().f267171i) * 1000;
            if (j >= 1000) {
                C107509b bVar5 = this.f272989s;
                if (bVar5 != null) {
                    bVar5.mo157933f(j);
                }
            } else {
                C107509b bVar6 = this.f272989s;
                if (bVar6 != null) {
                    bVar6.mo157933f(1000);
                }
            }
        } else {
            int i = recordConfigProvider.f272936x;
            if (i > 0) {
                bVar4.mo157933f((long) i);
            } else {
                bVar4.mo157933f(1000);
            }
        }
        if (C90188n0.f258921O && (bVar = this.f272989s) != null) {
            bVar.f321642b.mo143177p(new C94419h(this));
        }
        this.f272982i.mo160527b(recordConfigProvider);
        C99450m0 m0Var = this.f272984n;
        m0Var.getClass();
        Boolean bool = recordConfigProvider.f272934v;
        C87412m.m108593f(bool, "config.enableAlbum");
        m0Var.f291590f = bool.booleanValue();
        m0Var.f291591g = recordConfigProvider.f272905F;
        C99466t0 t0Var = this.f272983j;
        t0Var.getClass();
        t0Var.f291629f = recordConfigProvider.f272905F;
        C99457n0 n0Var = this.f272986p;
        n0Var.getClass();
        boolean z3 = recordConfigProvider.f272915Q.f318441e;
        n0Var.f291604g = z3;
        int i2 = 8;
        if (z3) {
            n0Var.f291601d.setVisibility(0);
            n0Var.mo138899a(n0Var.f291605h ? n0Var.f291606i : n0Var.f291607j);
        } else {
            n0Var.f291601d.setVisibility(8);
        }
        C99467u0 u0Var = this.f272987q;
        u0Var.getClass();
        boolean z4 = recordConfigProvider.f272915Q.f318442f;
        u0Var.f291632f = z4;
        if (z4) {
            u0Var.f291630d.setVisibility(0);
            u0Var.f291633g = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", true);
            u0Var.f291631e.mo14585p(C101198e.C101199b.RECORD_BEAUTIFY, bundle);
        } else {
            u0Var.f291630d.setVisibility(8);
        }
        C99450m0 m0Var2 = this.f272984n;
        Boolean bool2 = recordConfigProvider.f272934v;
        C87412m.m108593f(bool2, "configProvider.enableAlbum");
        if (bool2.booleanValue()) {
            i2 = 0;
        }
        if (m0Var2.f291590f) {
            m0Var2.f291588d.setVisibility(i2);
        }
        Log.m105924i("MicroMsg.RecordPluginLayout", "configProvider:" + recordConfigProvider + ", config:" + C97884j.f287164a.mo137211d());
        String str = recordConfigProvider.f272916R;
        C87412m.m108593f(str, "configProvider.captureHint");
        if (str.length() <= 0) {
            z = false;
        }
        if (z) {
            C109360o0 o0Var = this.f272982i;
            String str2 = recordConfigProvider.f272916R;
            C87412m.m108593f(str2, "configProvider.captureHint");
            o0Var.getClass();
            o0Var.f327381g.setText(str2);
        }
        C101891f fVar = C101891f.f300035a;
        C97877b bVar7 = this.f272988r;
        fVar.mo141383q(bVar7 != null ? bVar7.mo128038v() : false);
        C97877b bVar8 = this.f272988r;
        if (bVar8 != null) {
            z2 = bVar8.mo128017d();
        }
        fVar.mo141382p(z2);
    }

    /* renamed from: m */
    public final void mo129869m(boolean z) {
        C97877b bVar = this.f272988r;
        if (bVar != null) {
            bVar.f287123i = !z;
        }
        C107509b bVar2 = this.f272989s;
        if (bVar2 != null) {
            bVar2.mo157932e();
        }
        if (z) {
            this.f272982i.mo160526a();
        } else {
            this.f272982i.mo160532h(new C94427p(this));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        StringBuilder sb = new StringBuilder();
        sb.append("onConfigurationChanged:");
        sb.append(configuration);
        sb.append(" layout:");
        sb.append(configuration != null ? Integer.valueOf(configuration.screenLayout) : null);
        Log.m105924i("MicroMsg.RecordPluginLayout", sb.toString());
        super.onConfigurationChanged(configuration);
        RecordConfigProvider recordConfigProvider = this.f272991u;
        if (recordConfigProvider != null) {
            C97884j jVar = C97884j.f287164a;
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            C87412m.m108593f(videoTransPara, "it.videoParam");
            jVar.mo137210c(videoTransPara, recordConfigProvider.f272905F, true);
        }
    }

    public void onDetach() {
        super.onDetach();
        Log.m105924i("MicroMsg.RecordPluginLayout", "onDetach");
        C107509b bVar = this.f272989s;
        if (bVar != null) {
            bVar.mo157937k();
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "cameraPageStaytime_", Long.valueOf(getBrowserTimeMs()), C60242i.APPEND);
    }

    public void onOrientationChange(int i) {
        if (i >= 0) {
            this.f272985o.mo138906b((i == 90 || i == 270) ? i == 270 ? 90.0f : -90.0f : (float) i);
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.RecordPluginLayout", "onPause");
        C107509b bVar = this.f272989s;
        if (bVar != null) {
            bVar.mo157937k();
        }
        C98607d dVar = this.f272992v;
        if (dVar != null) {
            dVar.disable();
        }
        C110992d.f332425a.mo162670d(15);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        Log.m105924i("MicroMsg.RecordPluginLayout", "onRequestPermissionsResult requestCode:" + i + " permissions:" + strArr + " grantResults:" + iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 80) {
            return;
        }
        if (iArr[0] == 0) {
            mo129869m(true);
        } else {
            C76879j.m92709C(getContext(), C76577a.m92166q(getContext(), C0966R.string.htg), C76577a.m92166q(getContext(), C0966R.string.hti), C76577a.m92166q(getContext(), C0966R.string.hth), C76577a.m92166q(getContext(), C0966R.string.htf), false, new C94420i(this), new C94421j(this));
        }
    }

    public void onResume() {
        RecordConfigProvider recordConfigProvider;
        VideoTransPara videoTransPara;
        super.onResume();
        if (this.f272993w) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            mo129869m(((C103918d) C86312j.m106911c(C103918d.class)).Gd0((Activity) context, "android.permission.RECORD_AUDIO"));
        }
        C98607d dVar = this.f272992v;
        if (dVar != null) {
            dVar.enable();
        }
        C107509b bVar = this.f272989s;
        if (bVar != null) {
            int i = 0;
            List f = C64197v.m75537f(1, 2);
            RecordConfigProvider recordConfigProvider2 = this.f272991u;
            if (!(!C110818d0.m150903D(f, recordConfigProvider2 != null ? Integer.valueOf(recordConfigProvider2.f272905F) : null) || (recordConfigProvider = this.f272991u) == null || (videoTransPara = recordConfigProvider.f272926n) == null)) {
                Log.m105924i("MicroMsg.RecordPluginLayout", "onResume init SightRecordConfig");
                C97884j jVar = C97884j.f287164a;
                RecordConfigProvider recordConfigProvider3 = this.f272991u;
                if (recordConfigProvider3 != null) {
                    i = recordConfigProvider3.f272905F;
                }
                jVar.mo137210c(videoTransPara, i, true);
            }
            C99457n0 n0Var = this.f272986p;
            boolean z = bVar.f321646f;
            n0Var.f291605h = z;
            if (n0Var.f291604g) {
                n0Var.mo138899a(z ? n0Var.f291606i : n0Var.f291607j);
            }
            C107509b.m145625i(bVar, false, (Float) null, new C101200h(bVar), 3, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v4, types: [sh2.c] */
    /* JADX WARNING: type inference failed for: r7v14, types: [sh2.c] */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0243  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            java.lang.String r3 = "status"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "status : "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = "  param: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.RecordPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = r27.ordinal()
            if (r3 == 0) goto L_0x02e7
            r5 = 1
            r6 = 0
            if (r3 == r5) goto L_0x02cb
            r7 = 0
            r8 = 2
            if (r3 == r8) goto L_0x0297
            r9 = 4
            r10 = 0
            if (r3 == r9) goto L_0x026b
            r9 = 5
            java.lang.String r11 = "KEY_START_RECORD_MS_LONG"
            if (r3 == r9) goto L_0x01b9
            r8 = 6
            if (r3 == r8) goto L_0x0159
            r8 = 19
            if (r3 == r8) goto L_0x0134
            switch(r3) {
                case 14: goto L_0x010c;
                case 15: goto L_0x0088;
                case 16: goto L_0x0063;
                default: goto L_0x004c;
            }
        L_0x004c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unknown status "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x02fe
        L_0x0063:
            if (r2 == 0) goto L_0x006b
            java.lang.String r1 = "PARAM_BEAUTIFY_ENABLE"
            boolean r6 = r2.getBoolean(r1)
        L_0x006b:
            fh2.b r1 = r0.f272988r
            if (r1 == 0) goto L_0x0074
            s80.a r1 = r1.getPreviewRenderer()
            goto L_0x0075
        L_0x0074:
            r1 = r7
        L_0x0075:
            boolean r2 = r1 instanceof sh2.C110790c
            if (r2 == 0) goto L_0x007c
            r7 = r1
            sh2.c r7 = (sh2.C110790c) r7
        L_0x007c:
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r1 = r0.f272981h
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$n r2 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$n
            r2.<init>(r0, r7, r6)
            r1.mo148312q(r2)
            goto L_0x02fe
        L_0x0088:
            if (r2 == 0) goto L_0x02fe
            java.lang.String r1 = "PARAM_PHOTO_LIST"
            java.util.ArrayList r1 = r2.getStringArrayList(r1)
            java.lang.String r3 = "PARAM_VIDEO_LIST"
            java.util.ArrayList r3 = r2.getStringArrayList(r3)
            h90.b r4 = new h90.b
            r7 = r4
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 65535(0xffff, float:9.1834E-41)
            r25 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r1 == 0) goto L_0x00c4
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r7 = 0
            goto L_0x00c5
        L_0x00c4:
            r7 = 1
        L_0x00c5:
            if (r7 != 0) goto L_0x00d9
            gy3.C87412m.m108591d(r1)
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r8 = "imageList!![0]"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            r4.f288189j = r7
            r4.f288190k = r1
        L_0x00d9:
            if (r3 == 0) goto L_0x00e3
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r5 = 0
        L_0x00e3:
            if (r5 != 0) goto L_0x00f8
            gy3.C87412m.m108591d(r3)
            java.lang.Object r1 = r3.get(r6)
            java.lang.String r5 = "videoList!![0]"
            gy3.C87412m.m108593f(r1, r5)
            java.lang.String r1 = (java.lang.String) r1
            r4.f288180a = r1
            r4.f288191l = r3
        L_0x00f8:
            r4.f288182c = r6
            r4.mo137619h()
            wg2.a r1 = r0.f272990t
            if (r1 == 0) goto L_0x02fe
            java.lang.String r3 = "PARAM_ROUTER_INT"
            int r2 = r2.getInt(r3, r6)
            r1.mo142012b(r2, r4)
            goto L_0x02fe
        L_0x010c:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            i72.d r3 = r0.f272992v
            if (r3 == 0) goto L_0x0119
            int r3 = r3.mo138048b()
            float r10 = (float) r3
        L_0x0119:
            th2.d r3 = th2.C110992d.f332425a
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.mo162677k(r11, r4)
            f90.b r3 = r0.f272989s
            if (r3 == 0) goto L_0x02fe
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$m r4 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$m
            r4.<init>(r1, r0, r10)
            r3.mo157941o(r4)
            goto L_0x02fe
        L_0x0134:
            if (r2 == 0) goto L_0x02fe
            java.lang.String r1 = "PARAM_FILTER_ENABLE"
            boolean r1 = r2.getBoolean(r1)
            fh2.b r2 = r0.f272988r
            if (r2 == 0) goto L_0x0145
            s80.a r2 = r2.getPreviewRenderer()
            goto L_0x0146
        L_0x0145:
            r2 = r7
        L_0x0146:
            boolean r3 = r2 instanceof sh2.C110790c
            if (r3 == 0) goto L_0x014d
            r7 = r2
            sh2.c r7 = (sh2.C110790c) r7
        L_0x014d:
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r2 = r0.f272981h
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$o r3 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$o
            r3.<init>(r7, r1)
            r2.mo148312q(r3)
            goto L_0x02fe
        L_0x0159:
            th2.f r1 = th2.C101891f.f300035a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.mo141376j(r2)
            f90.b r1 = r0.f272989s
            if (r1 == 0) goto L_0x0173
            com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$l r2 = new com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout$l
            r2.<init>(r0)
            boolean r1 = r1.mo157938l(r2)
            if (r1 != 0) goto L_0x0173
            r1 = 1
            goto L_0x0174
        L_0x0173:
            r1 = 0
        L_0x0174:
            if (r1 == 0) goto L_0x01a7
            lh2.o0 r1 = r0.f272982i
            r1.reset()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f272991u
            if (r1 == 0) goto L_0x0186
            int r1 = r1.f272905F
            r2 = 11
            if (r1 != r2) goto L_0x0186
            goto L_0x0187
        L_0x0186:
            r5 = 0
        L_0x0187:
            if (r5 == 0) goto L_0x01a2
            f90.b r1 = r0.f272989s
            if (r1 == 0) goto L_0x0190
            long r1 = r1.f321647g
            goto L_0x0192
        L_0x0190:
            r1 = 0
        L_0x0192:
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            r3 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a2
            lh2.o0 r1 = r0.f272982i
            r1.mo160561r()
            goto L_0x01a7
        L_0x01a2:
            lh2.o0 r1 = r0.f272982i
            r1.mo160529d()
        L_0x01a7:
            lh2.t0 r1 = r0.f272983j
            r1.setVisibility(r6)
            lh2.m0 r1 = r0.f272984n
            boolean r2 = r1.f291590f
            if (r2 == 0) goto L_0x02fe
            android.widget.ImageView r1 = r1.f291588d
            r1.setVisibility(r6)
            goto L_0x02fe
        L_0x01b9:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f272991u
            if (r1 == 0) goto L_0x01c3
            boolean r1 = r1.f272910K
            if (r1 != r5) goto L_0x01c3
            r1 = 1
            goto L_0x01c4
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            if (r1 == 0) goto L_0x01d9
            i72.d r1 = r0.f272992v
            if (r1 == 0) goto L_0x01cf
            boolean r1 = r1.mo138049c()
            goto L_0x01d0
        L_0x01cf:
            r1 = 0
        L_0x01d0:
            i72.d r2 = r0.f272992v
            if (r2 == 0) goto L_0x01da
            int r2 = r2.mo138047a()
            goto L_0x01db
        L_0x01d9:
            r1 = 0
        L_0x01da:
            r2 = 0
        L_0x01db:
            f90.b r3 = r0.f272989s
            if (r3 == 0) goto L_0x01e4
            boolean r1 = r3.mo157936j(r1, r2)
            goto L_0x01e5
        L_0x01e4:
            r1 = 0
        L_0x01e5:
            lh2.t0 r2 = r0.f272983j
            r3 = 8
            r2.setVisibility(r3)
            lh2.m0 r2 = r0.f272984n
            boolean r4 = r2.f291590f
            if (r4 == 0) goto L_0x01f7
            android.widget.ImageView r2 = r2.f291588d
            r2.setVisibility(r3)
        L_0x01f7:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 440(0x1b8, double:2.174E-321)
            r15 = 0
            r17 = 1
            r19 = 0
            r12 = r2
            r12.idkeyStat(r13, r15, r17, r19)
            boolean r3 = fh2.C97884j.f287168e
            if (r3 == 0) goto L_0x0250
            bp3.p r3 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Media_CaptureSoft_Int
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r3 = r3.mo109878a(r4, r6)
            boolean r4 = gy3.C87412m.m108589b(r3, r6)
            if (r4 != 0) goto L_0x0229
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x0227
            r3 = 1
            goto L_0x0234
        L_0x0227:
            r3 = 2
            goto L_0x0234
        L_0x0229:
            i72.r r3 = i72.C108388k.f324540d
            if (r3 == 0) goto L_0x0227
            boolean r4 = fh2.C97884j.f287168e
            if (r4 != 0) goto L_0x0232
            goto L_0x0227
        L_0x0232:
            int r3 = r3.f324551a
        L_0x0234:
            if (r3 != r5) goto L_0x0239
            r3 = 39
            goto L_0x023b
        L_0x0239:
            r3 = 36
        L_0x023b:
            int r4 = fh2.C97884j.f287166c
            r6 = 720(0x2d0, float:1.009E-42)
            if (r4 != r6) goto L_0x0243
            int r3 = r3 + r5
            goto L_0x0244
        L_0x0243:
            int r3 = r3 + r8
        L_0x0244:
            r13 = 440(0x1b8, double:2.174E-321)
            long r3 = (long) r3
            r17 = 1
            r19 = 0
            r12 = r2
            r15 = r3
            r12.idkeyStat(r13, r15, r17, r19)
        L_0x0250:
            th2.d r2 = th2.C110992d.f332425a
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.mo162677k(r11, r3)
            th2.f r2 = th2.C101891f.f300035a
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.mo141387u(r3)
            r2.mo141381o(r1)
            goto L_0x02fe
        L_0x026b:
            if (r2 == 0) goto L_0x0275
            java.lang.String r1 = "PARAM_POINT_X"
            float r1 = r2.getFloat(r1)
            r3 = r1
            goto L_0x0276
        L_0x0275:
            r3 = 0
        L_0x0276:
            if (r2 == 0) goto L_0x0280
            java.lang.String r1 = "PARAM_POINT_Y"
            float r10 = r2.getFloat(r1)
            r4 = r10
            goto L_0x0281
        L_0x0280:
            r4 = 0
        L_0x0281:
            f90.b r2 = r0.f272989s
            if (r2 == 0) goto L_0x02fe
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r1 = r0.f272981h
            int r5 = r1.getWidth()
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r1 = r0.f272981h
            int r6 = r1.getHeight()
            r7 = 400(0x190, double:1.976E-321)
            r2.mo157930c(r3, r4, r5, r6, r7)
            goto L_0x02fe
        L_0x0297:
            f90.b r1 = r0.f272989s
            if (r1 == 0) goto L_0x02a3
            boolean r1 = r1.mo157939m(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
        L_0x02a3:
            lh2.n0 r1 = r0.f272986p
            f90.b r2 = r0.f272989s
            if (r2 == 0) goto L_0x02ab
            boolean r6 = r2.f321646f
        L_0x02ab:
            r1.f291605h = r6
            boolean r2 = r1.f291604g
            if (r2 == 0) goto L_0x02bb
            if (r6 == 0) goto L_0x02b6
            boolean r2 = r1.f291606i
            goto L_0x02b8
        L_0x02b6:
            boolean r2 = r1.f291607j
        L_0x02b8:
            r1.mo138899a(r2)
        L_0x02bb:
            if (r7 == 0) goto L_0x02fe
            r7.booleanValue()
            lh2.x0 r1 = r0.f272985o
            boolean r2 = r7.booleanValue()
            r2 = r2 ^ r5
            r1.mo138905a(r2)
            goto L_0x02fe
        L_0x02cb:
            if (r2 == 0) goto L_0x02fe
            f90.b r1 = r0.f272989s
            if (r1 == 0) goto L_0x02fe
            java.lang.String r3 = "PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN"
            boolean r3 = r2.getBoolean(r3, r6)
            java.lang.String r4 = "PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN"
            boolean r4 = r2.getBoolean(r4, r5)
            java.lang.String r5 = "PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT"
            int r2 = r2.getInt(r5)
            r1.mo157942p(r3, r4, r2)
            goto L_0x02fe
        L_0x02e7:
            if (r2 == 0) goto L_0x02fe
            f90.b r1 = r0.f272989s
            if (r1 == 0) goto L_0x02fe
            java.lang.String r3 = "PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT"
            int r2 = r2.getInt(r3)
            int r3 = r1.f321652l
            if (r3 != 0) goto L_0x02fe
            y80.g r1 = r1.f321642b
            r3 = 10
            r1.mo143172k(r2, r3)
        L_0x02fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.RecordPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    public void release() {
        super.release();
        Log.m105924i("MicroMsg.RecordPluginLayout", "release");
        C107509b bVar = this.f272989s;
        if (bVar != null) {
            bVar.mo157931d();
        }
        C98607d dVar = this.f272992v;
        if (dVar != null) {
            dVar.disable();
        }
        C98607d dVar2 = this.f272992v;
        if (dVar2 != null) {
            dVar2.f289116g = null;
        }
        this.f272992v = null;
        RecordConfigProvider recordConfigProvider = this.f272991u;
        boolean z = false;
        if (recordConfigProvider != null && !recordConfigProvider.f272937y) {
            z = true;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183875f(new C94422k(this));
        }
    }

    public final void setConfigProvider(RecordConfigProvider recordConfigProvider) {
        this.f272991u = recordConfigProvider;
    }

    public final void setOrientationEventListener(C98607d dVar) {
        this.f272992v = dVar;
    }

    public final void setRecordController(C107509b bVar) {
        this.f272989s = bVar;
    }
}
