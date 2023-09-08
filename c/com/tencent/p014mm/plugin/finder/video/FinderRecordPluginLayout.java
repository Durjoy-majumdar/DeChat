package com.tencent.p014mm.plugin.finder.video;

import ac3.C103355g1;
import ac3.C103360i1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.camera.core.FocusMeteringAction;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRecordProfileReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoPublishStruct;
import com.tencent.p014mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.plugin.view.RecordTypeSelectView;
import com.tencent.p014mm.plugin.finder.video.plugin.view.SubRecordBeautyView;
import com.tencent.p014mm.plugin.finder.video.plugin.view.SubRecordFinishView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dp1.C107060u1;
import f40.C86709a0;
import f90.C107509b;
import fh2.C97884j;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C107910t2;
import gr1.C98178b;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98324b;
import ht1.C60200t1;
import ht1.C60206u1;
import i23.C8847a;
import i72.C108389l;
import i72.C98607d;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kr1.C109034a;
import kr1.C109039b;
import kr1.C109052r;
import kr1.C61147p;
import kr1.C61148q;
import kr1.C99171k;
import kr1.C99176o;
import lh2.C109344g0;
import lh2.C109360o0;
import lh2.C99469v0;
import lh2.C99473x0;
import lr1.C61382a;
import mr1.C109637q;
import nj3.C76879j;
import o40.C61926c;
import org.json.JSONObject;
import p232rw.C63679m;
import p447aw.C103918d;
import p625nu.C61901d;
import p682rz.C36594q;
import qh2.C101198e;
import rh3.C101383g;
import rr1.C13099a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s80.C110777a;
import sh2.C110790c;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C49712hj1;
import th2.C110992d;
import w80.C102361h;
import wg2.C102440a;
import x23.C112038b;
import y23.C112386e;
import y23.C112389i;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderRecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "Lnu/d$a;", "", "getMaxMegaVideoDuration", "Landroid/view/View;", "x", "Lrx3/g;", "getHeaderParentView", "()Landroid/view/View;", "headerParentView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout */
public final class FinderRecordPluginLayout extends BasePluginLayout implements C101198e, C61901d.C61902a {

    /* renamed from: K */
    public static final /* synthetic */ int f312841K = 0;

    /* renamed from: A */
    public C102440a f312842A;

    /* renamed from: B */
    public RecordConfigProvider f312843B;

    /* renamed from: C */
    public C98607d f312844C;

    /* renamed from: D */
    public C61148q f312845D;

    /* renamed from: E */
    public long f312846E;

    /* renamed from: F */
    public long f312847F;

    /* renamed from: G */
    public boolean f312848G;

    /* renamed from: H */
    public boolean f312849H;

    /* renamed from: I */
    public long f312850I;

    /* renamed from: J */
    public String f312851J;

    /* renamed from: h */
    public final CameraPreviewGLSurfaceView f312852h;

    /* renamed from: i */
    public final C109360o0 f312853i;

    /* renamed from: j */
    public final C99171k f312854j;

    /* renamed from: n */
    public final C99473x0 f312855n;

    /* renamed from: o */
    public final C99469v0 f312856o;

    /* renamed from: p */
    public final C109039b f312857p;

    /* renamed from: q */
    public final C61382a f312858q;

    /* renamed from: r */
    public final C61147p f312859r;

    /* renamed from: s */
    public final C99176o f312860s;

    /* renamed from: t */
    public final C109034a f312861t;

    /* renamed from: u */
    public final C109052r f312862u;

    /* renamed from: v */
    public final C107910t2 f312863v;

    /* renamed from: w */
    public final View f312864w;

    /* renamed from: x */
    public final C13601g f312865x = C36568h.m40985a(new C105299c(this));

    /* renamed from: y */
    public C98178b f312866y;

    /* renamed from: z */
    public C107509b f312867z;

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$e */
    public static final class C3909e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f17561d;

        public C3909e(FinderRecordPluginLayout finderRecordPluginLayout) {
            this.f17561d = finderRecordPluginLayout;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.f17561d.f312849H = true;
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f17561d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$f */
    public static final class C3910f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f17562d;

        public C3910f(FinderRecordPluginLayout finderRecordPluginLayout) {
            this.f17562d = finderRecordPluginLayout;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            FinderRecordPluginLayout finderRecordPluginLayout = this.f17562d;
            int i2 = FinderRecordPluginLayout.f312841K;
            finderRecordPluginLayout.mo149746t(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$g */
    public static final class C3911g extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C3911g f17563d = new C3911g();

        public C3911g() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105924i("Finder.FinderRecordPluginLayout", "startPreview finish:" + booleanValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$n */
    public static final class C3912n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f17564d;

        public C3912n(FinderRecordPluginLayout finderRecordPluginLayout) {
            this.f17564d = finderRecordPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f17564d.f312849H = true;
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f17564d.getContext());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$a */
    public static final class C105297a extends C87413o implements C32226l<ArrayList<Float>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105297a(FinderRecordPluginLayout finderRecordPluginLayout) {
            super(1);
            this.f312868d = finderRecordPluginLayout;
        }

        public Object invoke(Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            C87412m.m108594g(arrayList, LocaleUtil.ITALIAN);
            FinderRecordPluginLayout finderRecordPluginLayout = this.f312868d;
            Float Z = C110818d0.m150928Z(arrayList);
            float f = 0.0f;
            float floatValue = Z != null ? Z.floatValue() : 0.0f;
            float f2 = (float) 100;
            FinderRecordPluginLayout finderRecordPluginLayout2 = this.f312868d;
            finderRecordPluginLayout.f312847F = (long) ((floatValue / f2) * ((float) finderRecordPluginLayout2.f312846E));
            finderRecordPluginLayout2.f312862u.getClass();
            Float Z2 = C110818d0.m150928Z(arrayList);
            if (Z2 != null) {
                f = Z2.floatValue();
            }
            C109360o0 o0Var = this.f312868d.f312853i;
            o0Var.f327380f.setTag(C0966R.C0970id.d5c, Integer.valueOf((int) (((f / f2) * ((float) o0Var.f327384j)) / ((float) 1000))));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$b */
    public static final class C105298b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105298b(FinderRecordPluginLayout finderRecordPluginLayout) {
            super(0);
            this.f312869d = finderRecordPluginLayout;
        }

        public Object invoke() {
            return Integer.valueOf(this.f312869d.getHeight() - this.f312869d.f312852h.getBottom());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$c */
    public static final class C105299c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105299c(FinderRecordPluginLayout finderRecordPluginLayout) {
            super(0);
            this.f312870d = finderRecordPluginLayout;
        }

        public Object invoke() {
            return this.f312870d.findViewById(C0966R.C0970id.e6d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$d */
    public static final class C105300d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312871d;

        public C105300d(FinderRecordPluginLayout finderRecordPluginLayout) {
            this.f312871d = finderRecordPluginLayout;
        }

        public final void run() {
            this.f312871d.f312853i.mo160562s(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$h */
    public static final class C105301h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312872d;

        public C105301h(FinderRecordPluginLayout finderRecordPluginLayout) {
            this.f312872d = finderRecordPluginLayout;
        }

        public final void run() {
            RecordConfigProvider recordConfigProvider = this.f312872d.f312843B;
            C86013q1.m106447h(recordConfigProvider != null ? recordConfigProvider.f272903D : null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$i */
    public static final class C105302i extends C87413o implements C32226l<C98324b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312873d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f312874e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105302i(FinderRecordPluginLayout finderRecordPluginLayout, Bundle bundle) {
            super(1);
            this.f312873d = finderRecordPluginLayout;
            this.f312874e = bundle;
        }

        public Object invoke(Object obj) {
            C98324b bVar = (C98324b) obj;
            C101198e.C101199b bVar2 = C101198e.C101199b.SUB_RECORD_FINISH;
            C87412m.m108594g(bVar, "capture");
            FinderRecordPluginLayout finderRecordPluginLayout = this.f312873d;
            C61148q qVar = finderRecordPluginLayout.f312845D;
            String str = bVar.f288180a;
            C109039b bVar3 = finderRecordPluginLayout.f312857p;
            qVar.mo86088a(str, bVar3.f326566h ? bVar3.f326567i : bVar3.f326568j);
            FinderRecordPluginLayout finderRecordPluginLayout2 = this.f312873d;
            long j = 1;
            int i = 2;
            boolean z = false;
            if (finderRecordPluginLayout2.f312858q.f174589g) {
                finderRecordPluginLayout2.f312853i.f327380f.setTag(C0966R.C0970id.d3x, Boolean.TRUE);
                C110992d.m151314c(C110992d.f332425a, "KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0, 2, (Object) null);
                Bundle bundle = this.f312874e;
                if (bundle != null) {
                    FinderRecordPluginLayout finderRecordPluginLayout3 = this.f312873d;
                    if (bundle.getBoolean("PARAM_1_BOOLEAN")) {
                        Log.m105924i("Finder.FinderRecordPluginLayout", "sub record finish");
                        C115669n.INSTANCE.idkeyStat(1371, 191, 1, false);
                        C101198e.C62622a.m73576a(finderRecordPluginLayout3, bVar2, (Bundle) null, 2, (Object) null);
                    }
                }
                this.f312873d.f312853i.mo160556m(false);
                this.f312873d.f312853i.reset();
                C107509b bVar4 = this.f312873d.f312867z;
                if (bVar4 != null) {
                    bVar4.mo157932e();
                }
                this.f312873d.f312859r.setVisibility(0);
                this.f312873d.f312860s.setVisibility(0);
                this.f312873d.f312857p.setVisibility(4);
            } else {
                finderRecordPluginLayout2.f312853i.f327380f.setTag(C0966R.C0970id.d3x, Boolean.FALSE);
                C107060u1 u1Var = C107060u1.f320472a;
                C107060u1.m144952a(u1Var, 211, 0, 2, (Object) null);
                C107509b bVar5 = this.f312873d.f312867z;
                if (bVar5 != null && bVar5.f321646f) {
                    C107060u1.m144952a(u1Var, 214, 0, 2, (Object) null);
                } else {
                    C107060u1.m144952a(u1Var, 213, 0, 2, (Object) null);
                }
                C109039b bVar6 = this.f312873d.f312857p;
                if (bVar6.f326566h ? bVar6.f326567i : bVar6.f326568j) {
                    C107060u1.m144952a(u1Var, 215, 0, 2, (Object) null);
                }
                long j2 = (long) bVar.f288184e;
                C115669n.INSTANCE.idkeyStat(1371, 218, j2, false);
                if (j2 < FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
                    C107060u1.m144952a(u1Var, 220, 0, 2, (Object) null);
                } else if (j2 < 10000) {
                    C107060u1.m144952a(u1Var, 221, 0, 2, (Object) null);
                } else if (j2 < 15000) {
                    C107060u1.m144952a(u1Var, 222, 0, 2, (Object) null);
                } else if (j2 < 20000) {
                    C107060u1.m144952a(u1Var, 223, 0, 2, (Object) null);
                } else if (j2 < 30000) {
                    C107060u1.m144952a(u1Var, 224, 0, 2, (Object) null);
                } else if (j2 < 40000) {
                    C107060u1.m144952a(u1Var, 225, 0, 2, (Object) null);
                } else if (j2 < 50000) {
                    C107060u1.m144952a(u1Var, 226, 0, 2, (Object) null);
                } else {
                    C107060u1.m144952a(u1Var, 227, 0, 2, (Object) null);
                }
                C101198e.C62622a.m73576a(this.f312873d, bVar2, (Bundle) null, 2, (Object) null);
                C110992d dVar = C110992d.f332425a;
                C107509b bVar7 = this.f312873d.f312867z;
                if (!(bVar7 != null && bVar7.f321646f)) {
                    i = 1;
                }
                dVar.mo162677k("KEY_MEDIA_SOURCE_INT", Integer.valueOf(i));
                C102361h hVar = C102361h.f301459a;
                String str2 = bVar.f288180a;
                RecordConfigProvider recordConfigProvider = this.f312873d.f312843B;
                int i2 = -1;
                hVar.mo141930a(str2, recordConfigProvider != null ? recordConfigProvider.f272922g : 1, recordConfigProvider != null ? recordConfigProvider.f272921f : -1);
                String str3 = bVar.f288180a;
                RecordConfigProvider recordConfigProvider2 = this.f312873d.f312843B;
                int i3 = recordConfigProvider2 != null ? recordConfigProvider2.f272922g : 1;
                if (recordConfigProvider2 != null) {
                    i2 = recordConfigProvider2.f272905F;
                }
                C108389l.m146846g(str3, i3, i2);
                StoryDoPublishStruct storyDoPublishStruct = C110992d.f332428d;
                storyDoPublishStruct.f310297j = (long) (bVar.f288184e - bVar.f288183d);
                C107509b bVar8 = this.f312873d.f312867z;
                if (bVar8 != null && bVar8.f321646f) {
                    z = true;
                }
                if (z) {
                    j = 2;
                }
                storyDoPublishStruct.f310298k = j;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$j */
    public static final class C105303j extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderRecordPluginLayout f312875d;

        /* renamed from: e */
        public final /* synthetic */ long f312876e;

        /* renamed from: f */
        public final /* synthetic */ float f312877f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105303j(FinderRecordPluginLayout finderRecordPluginLayout, long j, float f) {
            super(1);
            this.f312875d = finderRecordPluginLayout;
            this.f312876e = j;
            this.f312877f = f;
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x014d  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x018b  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01d1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout r2 = r0.f312875d
                kr1.b r2 = r2.f312857p
                r2.mo160171j()
                long r2 = r0.f312876e
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "photo time cost : "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "Finder.FinderRecordPluginLayout"
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
                if (r1 == 0) goto L_0x0299
                com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout r5 = r0.f312875d
                float r6 = r0.f312877f
                f90.b r7 = r5.f312867z
                if (r7 == 0) goto L_0x004e
                r7.mo157937k()
            L_0x004e:
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
                if (r8 == r9) goto L_0x007e
                if (r8 != 0) goto L_0x007b
                r7 = 0
                goto L_0x007e
            L_0x007b:
                if (r8 != r4) goto L_0x007e
                r7 = 1
            L_0x007e:
                java.lang.String r8 = "rotate(it, orientation)"
                java.lang.String r9 = "rotateAndScale(temImage,…rientation, scale, scale)"
                r10 = 0
                if (r7 == 0) goto L_0x00e4
                r7 = 1156579328(0x44f00000, float:1920.0)
                int r11 = r1.getHeight()
                int r12 = r1.getWidth()
                if (r11 <= r12) goto L_0x00bb
                int r11 = r1.getHeight()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x00a9
                int r8 = r1.getHeight()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0141
            L_0x00a9:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x00af
                r7 = 1
                goto L_0x00b0
            L_0x00af:
                r7 = 0
            L_0x00b0:
                if (r7 != 0) goto L_0x0140
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0141
            L_0x00bb:
                int r11 = r1.getWidth()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x00d3
                int r8 = r1.getWidth()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0141
            L_0x00d3:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x00d9
                r7 = 1
                goto L_0x00da
            L_0x00d9:
                r7 = 0
            L_0x00da:
                if (r7 != 0) goto L_0x0140
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0141
            L_0x00e4:
                r7 = 1149698048(0x44870000, float:1080.0)
                int r11 = r1.getHeight()
                int r12 = r1.getWidth()
                if (r11 <= r12) goto L_0x0118
                int r11 = r1.getWidth()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x0107
                int r8 = r1.getWidth()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0141
            L_0x0107:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x010d
                r7 = 1
                goto L_0x010e
            L_0x010d:
                r7 = 0
            L_0x010e:
                if (r7 != 0) goto L_0x0140
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0141
            L_0x0118:
                int r11 = r1.getHeight()
                float r11 = (float) r11
                int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r11 <= 0) goto L_0x012f
                int r8 = r1.getHeight()
                float r8 = (float) r8
                float r7 = r7 / r8
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r1, r6, r7, r7)
                gy3.C87412m.m108593f(r7, r9)
                goto L_0x0141
            L_0x012f:
                int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r7 != 0) goto L_0x0135
                r7 = 1
                goto L_0x0136
            L_0x0135:
                r7 = 0
            L_0x0136:
                if (r7 != 0) goto L_0x0140
                android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r1, r6)
                gy3.C87412m.m108593f(r7, r8)
                goto L_0x0141
            L_0x0140:
                r7 = r1
            L_0x0141:
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r10 = 1119092736(0x42b40000, float:90.0)
                int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r10 != 0) goto L_0x014d
                r10 = 1
                goto L_0x014e
            L_0x014d:
                r10 = 0
            L_0x014e:
                if (r10 != 0) goto L_0x015e
                r10 = 1132920832(0x43870000, float:270.0)
                int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r6 != 0) goto L_0x0158
                r6 = 1
                goto L_0x0159
            L_0x0158:
                r6 = 0
            L_0x0159:
                if (r6 == 0) goto L_0x015c
                goto L_0x015e
            L_0x015c:
                r6 = 0
                goto L_0x015f
            L_0x015e:
                r6 = 1
            L_0x015f:
                kr1.a r10 = r5.f312861t
                r10.f326549o = r4
                dp1.u1 r10 = dp1.C107060u1.f320472a
                r12 = 200(0xc8, double:9.9E-322)
                r14 = 0
                r16 = 2
                r17 = 0
                r11 = r10
                dp1.C107060u1.m144952a(r11, r12, r14, r16, r17)
                f90.b r11 = r5.f312867z
                if (r11 == 0) goto L_0x017b
                boolean r11 = r11.f321646f
                if (r11 != r4) goto L_0x017b
                r11 = 1
                goto L_0x017c
            L_0x017b:
                r11 = 0
            L_0x017c:
                if (r11 == 0) goto L_0x018b
                r12 = 202(0xca, double:1.0E-321)
                r14 = 0
                r16 = 2
                r17 = 0
                r11 = r10
                dp1.C107060u1.m144952a(r11, r12, r14, r16, r17)
                goto L_0x0197
            L_0x018b:
                r12 = 201(0xc9, double:9.93E-322)
                r14 = 0
                r16 = 2
                r17 = 0
                r11 = r10
                dp1.C107060u1.m144952a(r11, r12, r14, r16, r17)
            L_0x0197:
                kr1.b r11 = r5.f312857p
                boolean r12 = r11.f326566h
                if (r12 == 0) goto L_0x01a0
                boolean r11 = r11.f326567i
                goto L_0x01a2
            L_0x01a0:
                boolean r11 = r11.f326568j
            L_0x01a2:
                if (r11 == 0) goto L_0x01b0
                r12 = 203(0xcb, double:1.003E-321)
                r14 = 0
                r16 = 2
                r17 = 0
                r11 = r10
                dp1.C107060u1.m144952a(r11, r12, r14, r16, r17)
            L_0x01b0:
                i23.a r18 = i23.C8847a.f28097a
                r19 = 99
                r20 = 1
                long r10 = java.lang.System.currentTimeMillis()
                long r12 = r5.f312850I
                long r21 = r10 - r12
                r23 = 1
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 112(0x70, float:1.57E-43)
                r28 = 0
                i23.C8847a.m8677a(r18, r19, r20, r21, r23, r24, r25, r26, r27, r28)
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r10 = r5.f312843B
                if (r10 == 0) goto L_0x0299
                r11 = 100
                android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0279 }
                java.lang.String r13 = r10.f272903D     // Catch:{ IOException -> 0x0279 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r11, r12, r13, r4)     // Catch:{ IOException -> 0x0279 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0279 }
                r7.<init>()     // Catch:{ IOException -> 0x0279 }
                java.lang.String r11 = "save picture in "
                r7.append(r11)     // Catch:{ IOException -> 0x0279 }
                java.lang.String r11 = r10.f272903D     // Catch:{ IOException -> 0x0279 }
                r7.append(r11)     // Catch:{ IOException -> 0x0279 }
                java.lang.String r11 = "  cost: "
                r7.append(r11)     // Catch:{ IOException -> 0x0279 }
                long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)     // Catch:{ IOException -> 0x0279 }
                r7.append(r8)     // Catch:{ IOException -> 0x0279 }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0279 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ IOException -> 0x0279 }
                java.lang.String r3 = r10.f272903D     // Catch:{ IOException -> 0x0279 }
                java.lang.String r7 = "this.inputPhotoPath"
                gy3.C87412m.m108593f(r3, r7)     // Catch:{ IOException -> 0x0279 }
                h90.b r7 = new h90.b     // Catch:{ IOException -> 0x0279 }
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
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x0279 }
                r7.f288192m = r6     // Catch:{ IOException -> 0x0279 }
                android.os.Bundle r3 = r5.mo149741n()     // Catch:{ IOException -> 0x0279 }
                r7.f288193n = r3     // Catch:{ IOException -> 0x0279 }
                r11 = 1
                r12 = 0
                java.lang.String r14 = r10.f272903D     // Catch:{ IOException -> 0x0279 }
                java.lang.String r15 = ""
                java.lang.String r16 = ""
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r11, r12, r14, r15, r16)     // Catch:{ IOException -> 0x0279 }
                java.lang.String r6 = "KEY_MEDIA_IS_BEAUTY"
                kr1.b r8 = r5.f312857p     // Catch:{ IOException -> 0x0279 }
                boolean r9 = r8.f326566h     // Catch:{ IOException -> 0x0279 }
                if (r9 == 0) goto L_0x024a
                boolean r8 = r8.f326567i     // Catch:{ IOException -> 0x0279 }
                goto L_0x024c
            L_0x024a:
                boolean r8 = r8.f326568j     // Catch:{ IOException -> 0x0279 }
            L_0x024c:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ IOException -> 0x0279 }
                java.util.HashMap<java.lang.String, java.lang.Object> r9 = r3.f162760t     // Catch:{ IOException -> 0x0279 }
                r9.put(r6, r8)     // Catch:{ IOException -> 0x0279 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0279 }
                r3.f162752i = r8     // Catch:{ IOException -> 0x0279 }
                r5.mo149744q(r4)     // Catch:{ IOException -> 0x0279 }
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r5.f312843B     // Catch:{ IOException -> 0x0279 }
                if (r6 != 0) goto L_0x0263
                goto L_0x0271
            L_0x0263:
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem[] r8 = new com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem[r4]     // Catch:{ IOException -> 0x0279 }
                r8[r2] = r3     // Catch:{ IOException -> 0x0279 }
                java.util.ArrayList r3 = sx3.C64197v.m75534c(r8)     // Catch:{ IOException -> 0x0279 }
                android.os.Bundle r3 = r5.mo149740m(r3)     // Catch:{ IOException -> 0x0279 }
                r6.f272912M = r3     // Catch:{ IOException -> 0x0279 }
            L_0x0271:
                wg2.a r3 = r5.f312842A     // Catch:{ IOException -> 0x0279 }
                if (r3 == 0) goto L_0x0299
                r3.mo142012b(r4, r7)     // Catch:{ IOException -> 0x0279 }
                goto L_0x0299
            L_0x0279:
                f90.b r8 = r5.f312867z
                if (r8 == 0) goto L_0x028c
                r9 = 0
                r3 = 1071877689(0x3fe38e39, float:1.7777778)
                java.lang.Float r10 = java.lang.Float.valueOf(r3)
                r11 = 0
                r12 = 5
                r13 = 0
                f90.C107509b.m145625i(r8, r9, r10, r11, r12, r13)
            L_0x028c:
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r15 = 985(0x3d9, double:4.867E-321)
                r17 = 130(0x82, double:6.4E-322)
                r19 = 1
                r21 = 0
                r14.idkeyStat(r15, r17, r19, r21)
            L_0x0299:
                th2.d r3 = th2.C110992d.f332425a
                com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout r5 = r0.f312875d
                f90.b r5 = r5.f312867z
                if (r5 == 0) goto L_0x02a6
                boolean r5 = r5.f321646f
                if (r5 != r4) goto L_0x02a6
                r2 = 1
            L_0x02a6:
                if (r2 == 0) goto L_0x02a9
                r4 = 2
            L_0x02a9:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                java.lang.String r4 = "KEY_MEDIA_SOURCE_INT"
                r3.mo162677k(r4, r2)
                if (r1 != 0) goto L_0x02c0
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r6 = 985(0x3d9, double:4.867E-321)
                r8 = 121(0x79, double:6.0E-322)
                r10 = 1
                r12 = 0
                r5.idkeyStat(r6, r8, r10, r12)
            L_0x02c0:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderRecordPluginLayout.C105303j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$k */
    public static final class C105304k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110790c f312878d;

        /* renamed from: e */
        public final /* synthetic */ boolean f312879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105304k(C110790c cVar, boolean z) {
            super(0);
            this.f312878d = cVar;
            this.f312879e = z;
        }

        public Object invoke() {
            C103355g1 g1Var;
            C110790c cVar = this.f312878d;
            if (!(cVar == null || (g1Var = cVar.f331427v) == null || this.f312879e)) {
                g1Var.mo143252s(new XEffectConfig());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$l */
    public static final class C105305l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110790c f312880d;

        /* renamed from: e */
        public final /* synthetic */ XEffectConfig f312881e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105305l(C110790c cVar, XEffectConfig xEffectConfig) {
            super(0);
            this.f312880d = cVar;
            this.f312881e = xEffectConfig;
        }

        public Object invoke() {
            C110790c cVar = this.f312880d;
            if (cVar != null) {
                XEffectConfig xEffectConfig = this.f312881e;
                C87412m.m108593f(xEffectConfig, LocaleUtil.ITALIAN);
                cVar.f331429x = xEffectConfig;
                C103355g1 g1Var = cVar.f331427v;
                if (g1Var != null) {
                    g1Var.mo143252s(xEffectConfig);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$m */
    public static final class C105306m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110790c f312882d;

        /* renamed from: e */
        public final /* synthetic */ C101383g f312883e;

        /* renamed from: f */
        public final /* synthetic */ FinderRecordPluginLayout f312884f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105306m(C110790c cVar, C101383g gVar, FinderRecordPluginLayout finderRecordPluginLayout) {
            super(0);
            this.f312882d = cVar;
            this.f312883e = gVar;
            this.f312884f = finderRecordPluginLayout;
        }

        public Object invoke() {
            C103355g1 g1Var = this.f312882d.f331427v;
            if (g1Var != null) {
                g1Var.mo143257x(this.f312883e);
            }
            if (this.f312883e != null) {
                C61926c.m72666K(2000, new C105307f(this.f312882d, this.f312884f));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRecordPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f312844C = new C98607d(context, 2);
        this.f312845D = new C61148q(this);
        this.f312848G = true;
        this.f312851J = "";
        LayoutInflater.from(context).inflate(C0966R.C0971layout.aoo, this, true);
        View findViewById = findViewById(C0966R.C0970id.kaw);
        C87412m.m108593f(findViewById, "findViewById(R.id.switch_camera)");
        C99473x0 x0Var = new C99473x0((ImageView) findViewById, this);
        this.f312855n = x0Var;
        View findViewById2 = findViewById(C0966R.C0970id.bex);
        C87412m.m108593f(findViewById2, "findViewById(com.tencent…dvideo.R.id.close_plugin)");
        C99171k kVar = new C99171k((WeImageView) findViewById2, this, findViewById(C0966R.C0970id.bed));
        this.f312854j = kVar;
        C99469v0 v0Var = new C99469v0(this, this);
        this.f312856o = v0Var;
        View findViewById3 = findViewById(C0966R.C0970id.ii6);
        C87412m.m108593f(findViewById3, "findViewById(R.id.record_plugin)");
        C109360o0 o0Var = new C109360o0((RelativeLayout) findViewById3, this);
        this.f312853i = o0Var;
        View findViewById4 = findViewById(C0966R.C0970id.e4j);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_preview_plugin)");
        this.f312852h = (CameraPreviewGLSurfaceView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.iid);
        C87412m.m108593f(findViewById5, "findViewById(R.id.record_type_view)");
        C61382a aVar = new C61382a((RecordTypeSelectView) findViewById5, this);
        this.f312858q = aVar;
        C109052r rVar = new C109052r(this, this);
        this.f312862u = rVar;
        C109034a aVar2 = new C109034a(this, this);
        this.f312861t = aVar2;
        ((ArrayList) aVar2.f326552r).add(rVar);
        this.f312863v = new C107910t2(this, this);
        View findViewById6 = findViewById(C0966R.C0970id.c1k);
        C87412m.m108593f(findViewById6, "findViewById(com.tencent…lete_sub_video_container)");
        this.f312860s = new C99176o(findViewById6, this);
        o0Var.f327393v = new C105297a(this);
        o0Var.f327396y = false;
        new C105298b(this);
        View findViewById7 = findViewById(C0966R.C0970id.e6e);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder_record_layout)");
        this.f312864w = findViewById7;
        SubRecordFinishView subRecordFinishView = new SubRecordFinishView(context, (AttributeSet) null);
        subRecordFinishView.setVisibility(4);
        ((FrameLayout) findViewById(C0966R.C0970id.itm)).addView(subRecordFinishView, new FrameLayout.LayoutParams(-1, -1));
        this.f312859r = new C61147p(subRecordFinishView, this);
        SubRecordBeautyView subRecordBeautyView = new SubRecordBeautyView(context, (AttributeSet) null);
        ((FrameLayout) findViewById(C0966R.C0970id.itm)).addView(subRecordBeautyView, new FrameLayout.LayoutParams(-1, -1));
        C109039b bVar = new C109039b(this, subRecordBeautyView, this);
        this.f312857p = bVar;
        Intent intent = ((Activity) context).getIntent();
        C87412m.m108593f(intent, "context as Activity).intent");
        C112389i iVar = new C112389i(this, intent);
        iVar.mo164105x(new C109637q(this));
        getPluginList().add(iVar);
        getPluginList().add(o0Var);
        getPluginList().add(kVar);
        getPluginList().add(x0Var);
        getPluginList().add(v0Var);
        getPluginList().add(aVar);
        getPluginList().add(this.f312845D);
        getPluginList().add(aVar2);
        getPluginList().add(rVar);
        getPluginList().add(bVar);
        C98607d dVar = this.f312844C;
        if (dVar != null) {
            dVar.f289116g = this;
        }
        if (dVar != null) {
            dVar.enable();
        }
    }

    private final View getHeaderParentView() {
        Object value = ((C36570n) this.f312865x).getValue();
        C87412m.m108593f(value, "<get-headerParentView>(...)");
        return (View) value;
    }

    private final long getMaxMegaVideoDuration() {
        Class cls = C60206u1.class;
        return ((long) (((C60206u1) C86312j.m106911c(cls)).mo60953lE() == 1 ? ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83778Y5() : ((C60206u1) C86312j.m106911c(cls)).Hl0())) * 1000;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (super.mo78564e()) {
            return true;
        }
        C101198e.C62622a.m73576a(this, C101198e.C101199b.UI_FINISH, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        String str;
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        this.f312843B = recordConfigProvider;
        this.f312866y = new C98178b(recordConfigProvider, this.f312852h);
        mo149742o();
        int d = C76577a.m92153d(getContext(), C0966R.color.f356996ai0);
        ImageView imageView = this.f312855n.f291647d;
        imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_filled_camera_switch, d));
        this.f312842A = aVar;
        this.f312843B = recordConfigProvider;
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1((Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
        Log.m105924i("MicroMsg.RecordPluginLayout", "checkAudioPermission " + z1 + " !");
        C98178b bVar = this.f312866y;
        boolean z = true;
        if (bVar != null) {
            bVar.f287123i = !z1;
        }
        C87412m.m108591d(bVar);
        C107509b bVar2 = new C107509b(bVar);
        this.f312867z = bVar2;
        if (recordConfigProvider.f272905F == 11) {
            long j = ((long) ((C36594q) C86312j.m106911c(C36594q.class)).Gu0().f267171i) * 1000;
            if (j >= 1000) {
                C107509b bVar3 = this.f312867z;
                if (bVar3 != null) {
                    bVar3.mo157933f(j);
                }
            } else {
                C107509b bVar4 = this.f312867z;
                if (bVar4 != null) {
                    bVar4.mo157933f(1000);
                }
            }
        } else {
            bVar2.mo157933f(1000);
        }
        this.f312853i.mo160527b(recordConfigProvider);
        Bundle bundle = recordConfigProvider.f272912M;
        String string = bundle != null ? bundle.getString("KEY_ORIGIN_MUSIC_PATH") : null;
        if (!Util.isNullOrNil(string)) {
            Bundle bundle2 = recordConfigProvider.f272912M;
            String str2 = "";
            if (bundle2 == null || (str = bundle2.getString("KEY_ORIGIN_MUSIC_NAME")) == null) {
                str = str2;
            }
            MultiMediaVideoChecker multiMediaVideoChecker = MultiMediaVideoChecker.f273077a;
            if (string != null) {
                str2 = string;
            }
            C63679m.C63680a a = multiMediaVideoChecker.mo129929a(str2);
            if (a == null || a.f180528d == 0) {
                Log.m105920e("Finder.FinderRecordPluginLayout", "follow music error, path:" + string + ", length:" + C86013q1.m106451l(string));
                mo78564e();
                return;
            }
            AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
            audioCacheInfo.f163813e = (int) System.currentTimeMillis();
            Bundle bundle3 = recordConfigProvider.f272912M;
            audioCacheInfo.f163821p = bundle3 != null ? bundle3.getBoolean("KEY_BGM_IF_ORIGIN") : false ? 1 : 2;
            audioCacheInfo.f163818j = true;
            audioCacheInfo.f163824s = true;
            audioCacheInfo.f163817i = string;
            audioCacheInfo.f163825t = str;
            audioCacheInfo.f163822q = (int) a.f180528d;
            C109034a aVar2 = this.f312861t;
            List<AudioCacheInfo> b = C26236u.m33719b(audioCacheInfo);
            aVar2.getClass();
            aVar2.f326545h = b;
            this.f312848G = false;
            this.f312853i.mo160564u(C0966R.string.hu6);
            ((C119157j) C119157j.f356862d).mo183895z(new C105300d(this));
            this.f312861t.mo160159d(recordConfigProvider, false, false);
            this.f312861t.mo160156a();
            this.f312862u.mo160176d(true);
            this.f312862u.setVisibility(0);
        } else {
            this.f312861t.mo160159d(recordConfigProvider, false, false);
            this.f312862u.mo160176d(true);
            C109052r rVar = this.f312862u;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_record_enable_add_audio, 0) != 1) {
                z = false;
            }
            rVar.setVisibility(z ? 0 : 8);
        }
        this.f312861t.f326549o = false;
        C99469v0 v0Var = this.f312856o;
        v0Var.getClass();
        v0Var.f291636e.setFocusColor(recordConfigProvider.f272927o.f266583s);
        C99171k kVar = this.f312854j;
        kVar.getClass();
        kVar.f291629f = recordConfigProvider.f272905F;
        C109039b bVar5 = this.f312857p;
        bVar5.getClass();
        boolean z2 = recordConfigProvider.f272915Q.f318441e;
        bVar5.f326565g = z2;
        if (z2) {
            View view = bVar5.f326563e;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar5.mo160170i(bVar5.f326566h ? bVar5.f326567i : bVar5.f326568j);
        } else {
            View view3 = bVar5.f326563e;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin", "initConfig", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f312845D.getClass();
        Log.m105924i("Finder.FinderRecordPluginLayout", "configProvider:" + recordConfigProvider + ", config:" + C97884j.f287164a.mo137211d());
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        super.mo129855l(bVar);
        this.f312851J = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        C112389i iVar = (C112389i) mo151221j(C112389i.class);
        if (iVar != null) {
            C112386e eVar = (C112386e) iVar.mo164106y("21875");
            if (eVar != null) {
                String b = C112038b.m152775b(this.f312843B);
                FinderShowInWXProfileStruct finderShowInWXProfileStruct = (FinderShowInWXProfileStruct) eVar.f336503d;
                if (finderShowInWXProfileStruct != null) {
                    finderShowInWXProfileStruct.mo1040v(b);
                }
            }
            C112386e eVar2 = (C112386e) iVar.mo164106y("21875");
            if (eVar2 != null) {
                String c = C112038b.m152776c(this.f312843B);
                FinderShowInWXProfileStruct finderShowInWXProfileStruct2 = (FinderShowInWXProfileStruct) eVar2.f336503d;
                if (finderShowInWXProfileStruct2 != null) {
                    finderShowInWXProfileStruct2.mo1041w(c);
                }
            }
        }
        setBackgroundColor(Color.parseColor("#000000"));
        this.f312858q.setVisibility(4);
        C61382a aVar = this.f312858q;
        if (aVar.f174589g) {
            this.f312860s.setVisibility(0);
            this.f312859r.setVisibility(0);
        } else {
            aVar.setVisibility(0);
            this.f312857p.setVisibility(0);
            this.f312845D.mo86089b();
        }
        this.f312850I = System.currentTimeMillis();
        C8847a.m8677a(C8847a.f28097a, 99, 0, 0, 0, (JSONObject) null, (String) null, (C49712hj1) null, 124, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r5 = r5.f272912M;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo149740m(java.util.ArrayList<com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem> r5) {
        /*
            r4 = this;
            java.lang.Class<ht1.u1> r0 = ht1.C60206u1.class
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "media_list"
            r1.putParcelableArrayList(r2, r5)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r4.f312843B
            java.lang.String r2 = "post_id"
            if (r5 == 0) goto L_0x001b
            android.os.Bundle r5 = r5.f272912M
            if (r5 == 0) goto L_0x001b
            java.lang.String r5 = r5.getString(r2)
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            r1.putString(r2, r5)
            long r2 = r4.getMaxMegaVideoDuration()
            java.lang.String r5 = "video_max_duration"
            r1.putLong(r5, r2)
            long r2 = r4.getMaxMegaVideoDuration()
            java.lang.String r5 = "video_track_max_duration"
            r1.putLong(r5, r2)
            di3.d r5 = di3.C86312j.m106911c(r0)
            ht1.u1 r5 = (ht1.C60206u1) r5
            int r5 = r5.mo60950Yw()
            java.lang.String r2 = "image_max_height"
            r1.putInt(r2, r5)
            di3.d r5 = di3.C86312j.m106911c(r0)
            ht1.u1 r5 = (ht1.C60206u1) r5
            int r5 = r5.mo60943Ab()
            java.lang.String r2 = "image_max_width"
            r1.putInt(r2, r5)
            di3.d r5 = di3.C86312j.m106911c(r0)
            ht1.u1 r5 = (ht1.C60206u1) r5
            int r5 = r5.rh0()
            java.lang.String r0 = "image_compress_quality"
            r1.putInt(r0, r5)
            java.lang.Class<lr.b> r5 = p599lr.C61381b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            lr.b r5 = (p599lr.C61381b) r5
            java.lang.String r5 = r5.mo78541Ea()
            java.lang.String r0 = "output_dir"
            r1.putString(r0, r5)
            gr1.b r5 = r4.f312866y
            if (r5 == 0) goto L_0x0076
            boolean r5 = r5.f287123i
            goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            java.lang.String r0 = "KEY_MEDIA_MUTE"
            r1.putBoolean(r0, r5)
            r5 = 1
            java.lang.String r0 = "KEY_FULLSCREEN"
            r1.putBoolean(r0, r5)
            r5 = 2
            java.lang.String r0 = "KEY_MEDIA_SOURCE_FROM"
            r1.putInt(r0, r5)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r4.f312843B
            java.lang.String r5 = x23.C112038b.m152775b(r5)
            java.lang.String r0 = "FINDER_CONTEXT_ID"
            r1.putString(r0, r5)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r4.f312843B
            java.lang.String r5 = x23.C112038b.m152776c(r5)
            java.lang.String r0 = "FINDER_SESSION_ID"
            r1.putString(r0, r5)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r4.f312843B
            java.lang.String r5 = x23.C112038b.m152774a(r5)
            java.lang.String r0 = "key_click_tab_context_id"
            r1.putString(r0, r5)
            kr1.b r5 = r4.f312857p
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r5 = r5.f326573r
            java.lang.String r0 = "key_beauty_config"
            r1.putParcelable(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderRecordPluginLayout.mo149740m(java.util.ArrayList):android.os.Bundle");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r2 = r2.f272912M;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo149741n() {
        /*
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            kr1.a r1 = r5.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r1.f326548n
            if (r1 == 0) goto L_0x007d
            boolean r2 = r1.f163824s
            r3 = 0
            if (r2 == 0) goto L_0x005c
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r5.f312843B
            java.lang.String r4 = "KEY_ORIGIN_MUSIC_ID"
            if (r2 == 0) goto L_0x001f
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.getString(r4)
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            r0.putString(r4, r2)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r5.f312843B
            java.lang.String r4 = "KEY_ORIGIN_MUSIC_NAME"
            if (r2 == 0) goto L_0x0032
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = r2.getString(r4)
            goto L_0x0033
        L_0x0032:
            r2 = r3
        L_0x0033:
            r0.putString(r4, r2)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r5.f312843B
            java.lang.String r4 = "KEY_ORIGIN_MUSIC_PATH"
            if (r2 == 0) goto L_0x0045
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = r2.getString(r4)
            goto L_0x0046
        L_0x0045:
            r2 = r3
        L_0x0046:
            r0.putString(r4, r2)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r5.f312843B
            java.lang.String r4 = "KEY_ORIGIN_MUSIC_INFO"
            if (r2 == 0) goto L_0x0058
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x0058
            byte[] r2 = r2.getByteArray(r4)
            goto L_0x0059
        L_0x0058:
            r2 = r3
        L_0x0059:
            r0.putByteArray(r4, r2)
        L_0x005c:
            java.lang.String r2 = "KEY_SELECT_AUDIO_INFO"
            r0.putParcelable(r2, r1)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r5.f312843B
            java.lang.String r2 = "KEY_ORIGIN_BGM_URL"
            if (r1 == 0) goto L_0x006f
            android.os.Bundle r1 = r1.f272912M
            if (r1 == 0) goto L_0x006f
            java.lang.String r3 = r1.getString(r2)
        L_0x006f:
            r0.putString(r2, r3)
            java.lang.String r1 = "KEY_MEDIA_MUTE"
            r2 = 1
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "SELECT_MUTE_ORIGIN_KEY"
            r0.putBoolean(r1, r2)
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderRecordPluginLayout.mo149741n():android.os.Bundle");
    }

    /* renamed from: o */
    public final void mo149742o() {
        VideoTransPara videoTransPara;
        RecordConfigProvider recordConfigProvider = this.f312843B;
        if (recordConfigProvider != null && (videoTransPara = recordConfigProvider.f272926n) != null) {
            videoTransPara.f267167e = (videoTransPara.f267166d * 16) / 9;
            Log.m105924i("Finder.FinderRecordPluginLayout", "onResume init SightRecordConfig,fix record size:" + videoTransPara.f267166d + 'x' + videoTransPara.f267167e);
            C97884j.f287164a.mo137210c(videoTransPara, 0, false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 304 && i2 == 0) {
            mo129855l((C98324b) null);
        } else if (i == 304 && i2 == -1) {
            mo78564e();
        }
    }

    public void onDetach() {
        super.onDetach();
        Log.m105924i("Finder.FinderRecordPluginLayout", "onDetach");
        C107509b bVar = this.f312867z;
        if (bVar != null) {
            bVar.mo157937k();
        }
    }

    public void onOrientationChange(int i) {
        if (i >= 0) {
            this.f312855n.mo138906b((i == 90 || i == 270) ? i == 270 ? 90.0f : -90.0f : (float) i);
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("Finder.FinderRecordPluginLayout", "onPause");
        C107509b bVar = this.f312867z;
        if (bVar != null) {
            bVar.mo157937k();
        }
        C98607d dVar = this.f312844C;
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
            mo149746t(true);
        } else {
            C76879j.m92709C(getContext(), C76577a.m92166q(getContext(), C0966R.string.htg), C76577a.m92166q(getContext(), C0966R.string.hti), C76577a.m92166q(getContext(), C0966R.string.hth), C76577a.m92166q(getContext(), C0966R.string.htf), false, new C3909e(this), new C3910f(this));
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f312849H) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            mo149746t(((C103918d) C86312j.m106911c(C103918d.class)).Gd0((Activity) context, "android.permission.RECORD_AUDIO"));
        }
        mo149742o();
        C98607d dVar = this.f312844C;
        if (dVar != null) {
            dVar.enable();
        }
        C107509b bVar = this.f312867z;
        if (bVar != null) {
            C109039b bVar2 = this.f312857p;
            boolean z = bVar.f321646f;
            bVar2.f326566h = z;
            if (bVar2.f326565g) {
                bVar2.mo160170i(z ? bVar2.f326567i : bVar2.f326568j);
            }
            bVar.mo157935h(this.f312848G, Float.valueOf(1.7777778f), C3911g.f17563d);
        }
        this.f312853i.setVisibility(0);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Rect rect;
        super.onSizeChanged(i, i2, i3, i4);
        View findViewById = findViewById(C0966R.C0970id.e6e);
        View findViewById2 = findViewById(C0966R.C0970id.iid);
        View findViewById3 = findViewById(C0966R.C0970id.e6d);
        View findViewById4 = findViewById(C0966R.C0970id.e4j);
        View findViewById5 = findViewById(C0966R.C0970id.ii6);
        int c = C75044y4.m89991c(getContext());
        if (getContext() instanceof Activity) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            rect = C85875k4.m106194m((Activity) context);
        } else {
            rect = new Rect();
        }
        Rect rect2 = rect;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.LayoutParams layoutParams2 = findViewById3.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        int i5 = i2;
        findViewById4.getViewTreeObserver().addOnGlobalLayoutListener(new C13099a(findViewById4, i5, this, c, (RelativeLayout.LayoutParams) layoutParams, (RelativeLayout.LayoutParams) layoutParams3, (RelativeLayout.LayoutParams) layoutParams2, findViewById3, rect2, findViewById2, findViewById, findViewById5));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v18, types: [int] */
    /* JADX WARNING: type inference failed for: r3v219, types: [s80.a] */
    /* JADX WARNING: type inference failed for: r4v110, types: [s80.a] */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0860  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x087a  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x08a9  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x08ac  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x08b5  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x08f6  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0916  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r36, android.os.Bundle r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
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
            java.lang.String r4 = "Finder.FinderRecordPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = r36.ordinal()
            if (r3 == 0) goto L_0x09b6
            r5 = 0
            r6 = 1
            if (r3 == r6) goto L_0x0994
            r7 = 2
            if (r3 == r7) goto L_0x0964
            r8 = 4
            if (r3 == r8) goto L_0x0935
            r10 = 5
            java.lang.String r11 = "KEY_START_RECORD_MS_LONG"
            r12 = 8
            r13 = 0
            if (r3 == r10) goto L_0x082d
            r10 = 6
            r9 = 100
            java.lang.String r7 = "recordButton.subProgress"
            if (r3 == r10) goto L_0x0742
            r10 = 22
            if (r3 == r10) goto L_0x06b0
            r10 = 23
            if (r3 == r10) goto L_0x066b
            r10 = 45
            if (r3 == r10) goto L_0x05de
            r10 = 46
            if (r3 == r10) goto L_0x059a
            r10 = 49
            if (r3 == r10) goto L_0x0554
            r10 = 51
            r18 = 2131834461(0x7f11365d, float:1.9302033E38)
            r19 = 2131834465(0x7f113661, float:1.9302041E38)
            if (r3 == r10) goto L_0x04f4
            r10 = 137(0x89, float:1.92E-43)
            if (r3 == r10) goto L_0x04e3
            r10 = 144(0x90, float:2.02E-43)
            java.lang.String r15 = "KEY_SUB_VIDEO_NUM_INT"
            if (r3 == r10) goto L_0x0463
            switch(r3) {
                case 8: goto L_0x012d;
                case 9: goto L_0x0112;
                case 10: goto L_0x0103;
                case 11: goto L_0x0094;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r7 = "PARAM_1_BOOLEAN"
            switch(r3) {
                case 14: goto L_0x036d;
                case 15: goto L_0x02de;
                case 16: goto L_0x02b5;
                case 17: goto L_0x0291;
                case 18: goto L_0x0262;
                default: goto L_0x0079;
            }
        L_0x0079:
            switch(r3) {
                case 25: goto L_0x03e0;
                case 26: goto L_0x03bb;
                case 27: goto L_0x03a2;
                case 28: goto L_0x0399;
                default: goto L_0x007c;
            }
        L_0x007c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "unknown status "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0094:
            r24 = 193(0xc1, double:9.54E-322)
            r26 = 1
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1371(0x55b, double:6.774E-321)
            r28 = 0
            r21.idkeyStat(r22, r24, r26, r28)
            kr1.q r3 = r0.f312845D
            r3.mo86089b()
            lh2.o0 r3 = r0.f312853i
            kr1.q r4 = r0.f312845D
            java.util.ArrayList<java.lang.String> r4 = r4.f174085d
            int r4 = r4.size()
            r3.mo160558o(r4)
            lh2.o0 r3 = r0.f312853i
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton r3 = r3.f327380f
            java.util.List r3 = r3.getSubProgress()
            gy3.C87412m.m108593f(r3, r7)
            java.lang.Float r3 = sx3.C110818d0.m150928Z(r3)
            if (r3 == 0) goto L_0x00cb
            float r3 = r3.floatValue()
            r16 = r3
            goto L_0x00cd
        L_0x00cb:
            r16 = 0
        L_0x00cd:
            float r3 = (float) r9
            float r16 = r16 / r3
            long r3 = r0.f312846E
            float r3 = (float) r3
            float r3 = r3 * r16
            long r3 = (long) r3
            r0.f312847F = r3
            kr1.q r3 = r0.f312845D
            java.util.ArrayList<java.lang.String> r3 = r3.f174085d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00ff
            lr1.a r3 = r0.f312858q
            r3.setVisibility(r5)
            kr1.o r3 = r0.f312860s
            r3.setVisibility(r12)
            kr1.b r3 = r0.f312857p
            r3.setVisibility(r5)
            kr1.p r3 = r0.f312859r
            r3.setVisibility(r8)
            kr1.r r3 = r0.f312862u
            r3.mo160176d(r6)
            kr1.a r3 = r0.f312861t
            r3.f326549o = r5
        L_0x00ff:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0103:
            lh2.o0 r3 = r0.f312853i
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton r3 = r3.f327380f
            com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar r3 = r3.f313791h
            r3.f313750B = r5
            r3.postInvalidate()
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0112:
            r10 = 192(0xc0, double:9.5E-322)
            r12 = 1
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 1371(0x55b, double:6.774E-321)
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
            lh2.o0 r3 = r0.f312853i
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton r3 = r3.f327380f
            com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar r3 = r3.f313791h
            r3.f313750B = r6
            r3.postInvalidate()
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x012d:
            i23.a r16 = i23.C8847a.f28097a
            r17 = 99
            r18 = 1
            long r3 = java.lang.System.currentTimeMillis()
            long r9 = r0.f312850I
            long r19 = r3 - r9
            r21 = 1
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 112(0x70, float:1.57E-43)
            r26 = 0
            i23.C8847a.m8677a(r16, r17, r18, r19, r21, r22, r23, r24, r25, r26)
            lr1.a r3 = r0.f312858q
            boolean r3 = r3.f174589g
            if (r3 == 0) goto L_0x018f
            r19 = 229(0xe5, double:1.13E-321)
            r21 = 1
            com.tencent.mm.plugin.report.service.n r16 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 1371(0x55b, double:6.774E-321)
            r23 = 0
            r16.idkeyStat(r17, r19, r21, r23)
            kr1.q r3 = r0.f312845D
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r3 = r3.f174085d
            r4.<init>(r3)
            zt3.t r3 = zt3.C119157j.f356862d
            dp1.t1 r7 = new dp1.t1
            r7.<init>(r4)
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183875f(r7)
            th2.d r3 = th2.C110992d.f332425a
            kr1.q r4 = r0.f312845D
            r4.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r4 = r4.f174085d
            r7.<init>(r4)
            int r4 = r7.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo162677k(r15, r4)
            goto L_0x0198
        L_0x018f:
            kr1.r r3 = r0.f312862u
            r3.mo160176d(r6)
            kr1.a r3 = r0.f312861t
            r3.f326549o = r6
        L_0x0198:
            h90.b r3 = new h90.b
            r9 = r3
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
            r24 = 0
            r25 = 0
            r26 = 65535(0xffff, float:9.1834E-41)
            r27 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            kr1.q r4 = r0.f312845D
            r4.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r4 = r4.f174085d
            r7.<init>(r4)
            java.lang.Object r4 = r7.get(r5)
            java.lang.String r9 = "videoList[0]"
            gy3.C87412m.m108593f(r4, r9)
            java.lang.String r4 = (java.lang.String) r4
            r3.f288180a = r4
            r3.f288191l = r7
            r3.f288182c = r6
            r3.mo137619h()
            android.os.Bundle r4 = r35.mo149741n()
            r3.f288193n = r4
            r0.mo149745r(r6)
            r0.mo149744q(r6)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f312843B
            if (r4 != 0) goto L_0x01ee
            goto L_0x0255
        L_0x01ee:
            kr1.q r6 = r0.f312845D
            r6.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList<java.lang.String> r9 = r6.f174085d
            int r9 = r9.size()
        L_0x01fe:
            if (r5 >= r9) goto L_0x024f
            r10 = 2
            r11 = 0
            java.util.ArrayList<java.lang.String> r13 = r6.f174085d
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.m65488c(r10, r11, r13, r14, r15)
            java.util.ArrayList<java.lang.Boolean> r11 = r6.f174086e
            if (r5 < 0) goto L_0x0222
            int r12 = sx3.C64197v.m75536e(r11)
            if (r5 > r12) goto L_0x0222
            java.lang.Object r11 = r11.get(r5)
            goto L_0x0224
        L_0x0222:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L_0x0224:
            java.util.HashMap<java.lang.String, java.lang.Object> r12 = r10.f162760t
            java.lang.String r13 = "KEY_MEDIA_IS_BEAUTY"
            r12.put(r13, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "add sub video path:"
            r11.append(r12)
            java.util.ArrayList<java.lang.String> r12 = r6.f174085d
            java.lang.Object r12 = r12.get(r5)
            java.lang.String r12 = (java.lang.String) r12
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.FinderSubVideoFilePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            r7.add(r10)
            int r5 = r5 + 1
            goto L_0x01fe
        L_0x024f:
            android.os.Bundle r5 = r0.mo149740m(r7)
            r4.f272912M = r5
        L_0x0255:
            wg2.a r4 = r0.f312842A
            if (r4 == 0) goto L_0x025e
            r4.mo142012b(r8, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x025e:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0262:
            if (r2 == 0) goto L_0x028d
            java.lang.String r3 = "PARAM_BEAUTIFY_CONFIG"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r3 = (com.tencent.p014mm.plugin.xlabeffect.XEffectConfig) r3
            if (r3 == 0) goto L_0x028d
            gr1.b r4 = r0.f312866y
            if (r4 == 0) goto L_0x0277
            s80.a r4 = r4.getPreviewRenderer()
            goto L_0x0278
        L_0x0277:
            r4 = 0
        L_0x0278:
            boolean r5 = r4 instanceof sh2.C110790c
            if (r5 == 0) goto L_0x0280
            r15 = r4
            sh2.c r15 = (sh2.C110790c) r15
            goto L_0x0281
        L_0x0280:
            r15 = 0
        L_0x0281:
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r4 = r0.f312852h
            com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$l r5 = new com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$l
            r5.<init>(r15, r3)
            r4.mo148312q(r5)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x028d:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0291:
            if (r2 == 0) goto L_0x0298
            boolean r3 = r2.getBoolean(r7)
            goto L_0x0299
        L_0x0298:
            r3 = 0
        L_0x0299:
            lh2.o0 r4 = r0.f312853i
            android.widget.RelativeLayout r4 = r4.f327378d
            r4.clearAnimation()
            if (r3 == 0) goto L_0x02aa
            lh2.o0 r3 = r0.f312853i
            android.widget.RelativeLayout r3 = r3.f327378d
            r3.setVisibility(r8)
            goto L_0x02b1
        L_0x02aa:
            lh2.o0 r3 = r0.f312853i
            android.widget.RelativeLayout r3 = r3.f327378d
            r3.setVisibility(r5)
        L_0x02b1:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x02b5:
            if (r2 == 0) goto L_0x02bd
            java.lang.String r3 = "PARAM_BEAUTIFY_ENABLE"
            boolean r5 = r2.getBoolean(r3)
        L_0x02bd:
            gr1.b r3 = r0.f312866y
            if (r3 == 0) goto L_0x02c6
            s80.a r3 = r3.getPreviewRenderer()
            goto L_0x02c7
        L_0x02c6:
            r3 = 0
        L_0x02c7:
            boolean r4 = r3 instanceof sh2.C110790c
            if (r4 == 0) goto L_0x02cf
            r15 = r3
            sh2.c r15 = (sh2.C110790c) r15
            goto L_0x02d0
        L_0x02cf:
            r15 = 0
        L_0x02d0:
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r3 = r0.f312852h
            com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$k r4 = new com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$k
            r4.<init>(r15, r5)
            r3.mo148312q(r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x02de:
            if (r2 == 0) goto L_0x0369
            java.lang.String r3 = "PARAM_PHOTO_LIST"
            java.util.ArrayList r3 = r2.getStringArrayList(r3)
            java.lang.String r4 = "PARAM_VIDEO_LIST"
            java.util.ArrayList r4 = r2.getStringArrayList(r4)
            h90.b r15 = new h90.b
            r7 = r15
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r6 = r15
            r15 = r16
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
            if (r3 == 0) goto L_0x031c
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x031a
            goto L_0x031c
        L_0x031a:
            r7 = 0
            goto L_0x031d
        L_0x031c:
            r7 = 1
        L_0x031d:
            if (r7 != 0) goto L_0x0331
            gy3.C87412m.m108591d(r3)
            java.lang.Object r7 = r3.get(r5)
            java.lang.String r8 = "imageList!![0]"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            r6.f288189j = r7
            r6.f288190k = r3
        L_0x0331:
            if (r4 == 0) goto L_0x033d
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x033a
            goto L_0x033d
        L_0x033a:
            r26 = 0
            goto L_0x033f
        L_0x033d:
            r26 = 1
        L_0x033f:
            if (r26 != 0) goto L_0x0353
            gy3.C87412m.m108591d(r4)
            java.lang.Object r3 = r4.get(r5)
            java.lang.String r7 = "videoList!![0]"
            gy3.C87412m.m108593f(r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            r6.f288180a = r3
            r6.f288191l = r4
        L_0x0353:
            r6.f288182c = r5
            r6.mo137619h()
            wg2.a r3 = r0.f312842A
            if (r3 == 0) goto L_0x0367
            java.lang.String r4 = "PARAM_ROUTER_INT"
            int r4 = r2.getInt(r4, r5)
            r3.mo142012b(r4, r6)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0367:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0369:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x036d:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            i72.d r5 = r0.f312844C
            if (r5 == 0) goto L_0x037b
            int r5 = r5.mo138048b()
            float r9 = (float) r5
            goto L_0x037c
        L_0x037b:
            r9 = 0
        L_0x037c:
            th2.d r5 = th2.C110992d.f332425a
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.mo162677k(r11, r6)
            f90.b r5 = r0.f312867z
            if (r5 == 0) goto L_0x09d3
            com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$j r6 = new com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$j
            r6.<init>(r0, r3, r9)
            r5.mo157941o(r6)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0399:
            lh2.o0 r3 = r0.f312853i
            r3.mo160563t()
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x03a2:
            lr1.a r3 = r0.f312858q
            r3.setVisibility(r5)
            gr1.t2 r3 = r0.f312863v
            gr1.t2$a r4 = r3.f323104g
            r4.cancel()
            android.view.ViewGroup r3 = r3.f323102e
            r3.setVisibility(r12)
            kr1.a r3 = r0.f312861t
            r3.f326549o = r5
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x03bb:
            lr1.a r3 = r0.f312858q
            r3.setVisibility(r8)
            kr1.a r3 = r0.f312861t
            r3.mo160157b()
            gr1.t2 r3 = r0.f312863v
            android.widget.TextView r4 = r3.f323103f
            java.lang.String r6 = "3"
            r4.setText(r6)
            android.view.ViewGroup r4 = r3.f323102e
            r4.setVisibility(r5)
            gr1.t2$a r3 = r3.f323104g
            r3.start()
            kr1.a r3 = r0.f312861t
            r3.f326549o = r5
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x03e0:
            if (r2 == 0) goto L_0x045f
            lh2.o0 r3 = r0.f312853i
            boolean r4 = r2.getBoolean(r7)
            if (r4 != 0) goto L_0x03fc
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f312843B
            if (r4 == 0) goto L_0x03f7
            java.lang.Boolean r4 = r4.f272931s
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            goto L_0x03f8
        L_0x03f7:
            r4 = 0
        L_0x03f8:
            if (r4 == 0) goto L_0x03fc
            r4 = 1
            goto L_0x03fd
        L_0x03fc:
            r4 = 0
        L_0x03fd:
            r3.mo160556m(r4)
            boolean r3 = r2.getBoolean(r7)
            java.lang.String r4 = "KEY_IS_SUB_RECORD_BOOLEAN"
            if (r3 == 0) goto L_0x0439
            r0.f312847F = r13
            kr1.a r3 = r0.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r3 = r3.f326548n
            if (r3 != 0) goto L_0x0417
            r19 = 2131834495(0x7f11367f, float:1.9302102E38)
            r3 = 2131834495(0x7f11367f, float:1.9302102E38)
            goto L_0x041a
        L_0x0417:
            r3 = 2131834465(0x7f113661, float:1.9302041E38)
        L_0x041a:
            lh2.o0 r6 = r0.f312853i
            r6.mo160564u(r3)
            lh2.o0 r3 = r0.f312853i
            r6 = 1
            r3.mo160562s(r6)
            lh2.o0 r3 = r0.f312853i
            r3.mo160559p(r6, r6)
            th2.d r3 = th2.C110992d.f332425a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r3.mo162677k(r4, r6)
            java.lang.String r4 = "KEY_CHANGE_SUB_RECORD_TAB_INT"
            r6 = 0
            r7 = 2
            th2.C110992d.m151314c(r3, r4, r5, r7, r6)
            goto L_0x045d
        L_0x0439:
            kr1.a r3 = r0.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r3 = r3.f326548n
            if (r3 != 0) goto L_0x0443
            r3 = 2131834461(0x7f11365d, float:1.9302033E38)
            goto L_0x0446
        L_0x0443:
            r3 = 2131834465(0x7f113661, float:1.9302041E38)
        L_0x0446:
            lh2.o0 r6 = r0.f312853i
            r6.mo160564u(r3)
            lh2.o0 r3 = r0.f312853i
            r6 = 1
            r3.mo160562s(r6)
            lh2.o0 r3 = r0.f312853i
            r3.mo160559p(r5, r6)
            th2.d r3 = th2.C110992d.f332425a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.mo162677k(r4, r5)
        L_0x045d:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x045f:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0463:
            kr1.b r3 = r0.f312857p
            r3.mo160171j()
            r0.mo149745r(r5)
            r0.mo149744q(r5)
            i23.a r16 = i23.C8847a.f28097a
            r17 = 99
            r18 = 1
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.f312850I
            long r19 = r3 - r5
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 112(0x70, float:1.57E-43)
            r26 = 0
            i23.C8847a.m8677a(r16, r17, r18, r19, r21, r22, r23, r24, r25, r26)
            kr1.a r3 = r0.f312861t
            r3.mo160157b()
            lr1.a r3 = r0.f312858q
            boolean r3 = r3.f174589g
            if (r3 == 0) goto L_0x04af
            th2.d r3 = th2.C110992d.f332425a
            kr1.q r4 = r0.f312845D
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r4 = r4.f174085d
            r5.<init>(r4)
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo162677k(r15, r4)
        L_0x04af:
            lr1.a r3 = r0.f312858q
            boolean r3 = r3.f174589g
            if (r3 == 0) goto L_0x04d1
            kr1.q r3 = r0.f312845D
            java.util.ArrayList<java.lang.String> r3 = r3.f174085d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x04d1
            r7 = 194(0xc2, double:9.6E-322)
            r9 = 1
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1371(0x55b, double:6.774E-321)
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            kr1.k r3 = r0.f312854j
            r3.mo138537a()
            goto L_0x04df
        L_0x04d1:
            android.content.Context r3 = r35.getContext()
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI"
            gy3.C87412m.m108592e(r3, r4)
            com.tencent.mm.plugin.recordvideo.activity.MMRecordUI r3 = (com.tencent.p014mm.plugin.recordvideo.activity.MMRecordUI) r3
            r3.mo129783I7()
        L_0x04df:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x04e3:
            kr1.a r3 = r0.f312861t
            r3.mo160156a()
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r3 = r3.f326544g
            if (r3 == 0) goto L_0x04f0
            r4 = 1
            r3.setShow(r4)
        L_0x04f0:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x04f4:
            kr1.r r3 = r0.f312862u
            kr1.a r4 = r0.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r4.f326548n
            r3.f326599j = r4
            r3.mo160177f()
            kr1.a r3 = r0.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r3 = r3.f326548n
            if (r3 != 0) goto L_0x0509
            r3 = 2131834461(0x7f11365d, float:1.9302033E38)
            goto L_0x050c
        L_0x0509:
            r3 = 2131834465(0x7f113661, float:1.9302041E38)
        L_0x050c:
            lh2.o0 r4 = r0.f312853i
            r4.mo160564u(r3)
            lh2.o0 r3 = r0.f312853i
            r4 = 1
            r3.mo160562s(r4)
            kr1.a r3 = r0.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r3 = r3.f326548n
            if (r3 == 0) goto L_0x0535
            int r3 = r3.f163822q
            lh2.o0 r4 = r0.f312853i
            int r4 = r4.f327385n
            int r3 = java.lang.Math.min(r3, r4)
            lh2.o0 r4 = r0.f312853i
            r4.f327384j = r3
            kr1.r r4 = r0.f312862u
            long r5 = (long) r3
            r4.mo160175c(r5)
            r0.f312846E = r5
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0535:
            kr1.a r3 = r0.f312861t
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r3 = r3.f326548n
            if (r3 != 0) goto L_0x0550
            lh2.o0 r3 = r0.f312853i
            int r4 = r3.f327385n
            int r4 = r4 + 250
            r3.f327384j = r4
            kr1.r r3 = r0.f312862u
            long r4 = (long) r4
            r3.mo160175c(r4)
            lh2.o0 r3 = r0.f312853i
            int r3 = r3.f327384j
            long r3 = (long) r3
            r0.f312846E = r3
        L_0x0550:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0554:
            android.view.View r4 = r35.getHeaderParentView()
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r6)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r9 = "statusChange"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r4
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4.setVisibility(r3)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r6 = "statusChange"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x059a:
            android.view.View r4 = r0.f312864w
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r6)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r9 = "statusChange"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r4
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4.setVisibility(r3)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r6 = "statusChange"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x05de:
            kr1.a r3 = r0.f312861t
            r4 = 1
            r3.f326549o = r4
            r3.mo160158c()
            android.view.View r3 = r35.getHeaderParentView()
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r6)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r12 = "statusChange"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r11 = "statusChange"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r3 = r0.f312864w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r6)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r19 = "statusChange"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r18 = "statusChange"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x066b:
            if (r2 == 0) goto L_0x0674
            java.lang.String r3 = "PARAM_STICKER_LENS_ID"
            java.lang.String r6 = r2.getString(r3)
            goto L_0x0675
        L_0x0674:
            r6 = 0
        L_0x0675:
            gr1.b r3 = r0.f312866y
            if (r3 == 0) goto L_0x067e
            s80.a r3 = r3.getPreviewRenderer()
            goto L_0x067f
        L_0x067e:
            r3 = 0
        L_0x067f:
            boolean r4 = r3 instanceof sh2.C110790c
            if (r4 == 0) goto L_0x0686
            sh2.c r3 = (sh2.C110790c) r3
            goto L_0x0687
        L_0x0686:
            r3 = 0
        L_0x0687:
            if (r3 == 0) goto L_0x09d3
            if (r6 != 0) goto L_0x068d
            r15 = 0
            goto L_0x06a2
        L_0x068d:
            sh3.e r4 = sh3.C101624e.f297484a
            java.lang.String r4 = r4.mo141085b(r6)
            java.lang.String r5 = "packDir"
            gy3.C87412m.m108594g(r4, r5)
            rh3.g r15 = new rh3.g
            r15.<init>()
            r15.f296978c = r4
            r15.mo140865b(r4)
        L_0x06a2:
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r4 = r0.f312852h
            com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$m r5 = new com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$m
            r5.<init>(r3, r15, r0)
            r4.mo148312q(r5)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x06b0:
            if (r2 == 0) goto L_0x06b9
            java.lang.String r3 = "PARAM_STICKER_PANEL_OPEN"
            boolean r3 = r2.getBoolean(r3)
            goto L_0x06ba
        L_0x06b9:
            r3 = 0
        L_0x06ba:
            if (r3 != 0) goto L_0x06fd
            android.view.View r3 = r0.f312864w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r12 = "statusChange"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r11 = "statusChange"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x073e
        L_0x06fd:
            android.view.View r3 = r0.f312864w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r6)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r19 = "statusChange"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/video/FinderRecordPluginLayout"
            java.lang.String r18 = "statusChange"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x073e:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0742:
            kr1.b r3 = r0.f312857p
            r3.mo160171j()
            kr1.a r3 = r0.f312861t
            r3.mo160157b()
            f90.b r3 = r0.f312867z
            if (r3 == 0) goto L_0x075d
            com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$i r4 = new com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout$i
            r4.<init>(r0, r2)
            boolean r3 = r3.mo157938l(r4)
            if (r3 != 0) goto L_0x075d
            r3 = 1
            goto L_0x075e
        L_0x075d:
            r3 = 0
        L_0x075e:
            if (r3 == 0) goto L_0x0824
            lr1.a r3 = r0.f312858q
            boolean r3 = r3.f174589g
            if (r3 == 0) goto L_0x07e3
            r20 = 230(0xe6, double:1.136E-321)
            r22 = 1
            com.tencent.mm.plugin.report.service.n r17 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r18 = 1371(0x55b, double:6.774E-321)
            r24 = 0
            r17.idkeyStat(r18, r20, r22, r24)
            lh2.o0 r3 = r0.f312853i
            kr1.q r4 = r0.f312845D
            java.util.ArrayList<java.lang.String> r4 = r4.f174085d
            int r4 = r4.size()
            r3.mo160558o(r4)
            lh2.o0 r3 = r0.f312853i
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton r3 = r3.f327380f
            java.util.List r3 = r3.getSubProgress()
            gy3.C87412m.m108593f(r3, r7)
            java.lang.Float r3 = sx3.C110818d0.m150928Z(r3)
            if (r3 == 0) goto L_0x0798
            float r3 = r3.floatValue()
            r16 = r3
            goto L_0x079a
        L_0x0798:
            r16 = 0
        L_0x079a:
            float r3 = (float) r9
            float r16 = r16 / r3
            long r3 = r0.f312846E
            float r3 = (float) r3
            float r3 = r3 * r16
            long r3 = (long) r3
            r0.f312847F = r3
            kr1.q r3 = r0.f312845D
            java.util.ArrayList<java.lang.String> r3 = r3.f174085d
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x07c9
            lr1.a r3 = r0.f312858q
            r3.setVisibility(r5)
            kr1.r r3 = r0.f312862u
            r4 = 1
            r3.mo160176d(r4)
            kr1.a r3 = r0.f312861t
            r3.f326549o = r5
            kr1.b r3 = r0.f312857p
            r3.setVisibility(r5)
            kr1.p r3 = r0.f312859r
            r3.setVisibility(r12)
            goto L_0x07d8
        L_0x07c9:
            kr1.o r3 = r0.f312860s
            r3.setVisibility(r5)
            kr1.b r3 = r0.f312857p
            r3.setVisibility(r12)
            kr1.p r3 = r0.f312859r
            r3.setVisibility(r5)
        L_0x07d8:
            lh2.o0 r3 = r0.f312853i
            r3.mo160561r()
            lh2.o0 r3 = r0.f312853i
            r3.reset()
            goto L_0x0824
        L_0x07e3:
            lh2.o0 r3 = r0.f312853i
            r3.reset()
            f90.b r3 = r0.f312867z
            if (r3 == 0) goto L_0x07ee
            long r13 = r3.f321647g
        L_0x07ee:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r13)
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x081f
            r12 = 212(0xd4, double:1.047E-321)
            r14 = 1
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 1371(0x55b, double:6.774E-321)
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            lh2.o0 r3 = r0.f312853i
            r3.mo160561r()
            lr1.a r3 = r0.f312858q
            r3.setVisibility(r5)
            kr1.b r3 = r0.f312857p
            r3.setVisibility(r5)
            kr1.r r3 = r0.f312862u
            r4 = 1
            r3.mo160176d(r4)
            kr1.a r3 = r0.f312861t
            r3.f326549o = r5
            goto L_0x0824
        L_0x081f:
            lh2.o0 r3 = r0.f312853i
            r3.mo160529d()
        L_0x0824:
            kr1.k r3 = r0.f312854j
            r3.setVisibility(r5)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x082d:
            lh2.o0 r3 = r0.f312853i
            com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton r3 = r3.f327380f
            r4 = 2131302526(0x7f09187e, float:1.822314E38)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r3.setTag(r4, r6)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f312843B
            if (r3 == 0) goto L_0x0844
            boolean r3 = r3.f272910K
            r4 = 1
            if (r3 != r4) goto L_0x0844
            r3 = 1
            goto L_0x0845
        L_0x0844:
            r3 = 0
        L_0x0845:
            if (r3 == 0) goto L_0x085a
            i72.d r3 = r0.f312844C
            if (r3 == 0) goto L_0x0850
            boolean r3 = r3.mo138049c()
            goto L_0x0851
        L_0x0850:
            r3 = 0
        L_0x0851:
            i72.d r4 = r0.f312844C
            if (r4 == 0) goto L_0x085b
            int r4 = r4.mo138047a()
            goto L_0x085c
        L_0x085a:
            r3 = 0
        L_0x085b:
            r4 = 0
        L_0x085c:
            f90.b r6 = r0.f312867z
            if (r6 == 0) goto L_0x0863
            r6.mo157936j(r3, r4)
        L_0x0863:
            kr1.a r3 = r0.f312861t
            r3.f326549o = r5
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 440(0x1b8, double:2.174E-321)
            r30 = 0
            r32 = 1
            r34 = 0
            r27 = r3
            r27.idkeyStat(r28, r30, r32, r34)
            boolean r4 = fh2.C97884j.f287168e
            if (r4 == 0) goto L_0x08c5
            bp3.p r4 = bp3.C79758p.f233760a
            bp3.f r6 = bp3.C104160f.RepairerConfig_Media_CaptureSoft_Int
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.mo109878a(r6, r7)
            boolean r6 = gy3.C87412m.m108589b(r4, r7)
            if (r6 != 0) goto L_0x089b
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r4 = gy3.C87412m.m108589b(r4, r7)
            if (r4 == 0) goto L_0x0899
            r4 = 1
            goto L_0x08a6
        L_0x0899:
            r4 = 2
            goto L_0x08a6
        L_0x089b:
            i72.r r4 = i72.C108388k.f324540d
            if (r4 == 0) goto L_0x0899
            boolean r6 = fh2.C97884j.f287168e
            if (r6 != 0) goto L_0x08a4
            goto L_0x0899
        L_0x08a4:
            int r4 = r4.f324551a
        L_0x08a6:
            r6 = 1
            if (r4 != r6) goto L_0x08ac
            r4 = 39
            goto L_0x08ae
        L_0x08ac:
            r4 = 36
        L_0x08ae:
            int r7 = fh2.C97884j.f287166c
            r9 = 720(0x2d0, float:1.009E-42)
            if (r7 != r9) goto L_0x08b5
            goto L_0x08b6
        L_0x08b5:
            r6 = 2
        L_0x08b6:
            int r4 = r4 + r6
            r28 = 440(0x1b8, double:2.174E-321)
            long r6 = (long) r4
            r32 = 1
            r34 = 0
            r27 = r3
            r30 = r6
            r27.idkeyStat(r28, r30, r32, r34)
        L_0x08c5:
            th2.d r4 = th2.C110992d.f332425a
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.mo162677k(r11, r6)
            kr1.b r6 = r0.f312857p
            r6.setVisibility(r8)
            kr1.p r6 = r0.f312859r
            r6.setVisibility(r8)
            kr1.o r6 = r0.f312860s
            r6.setVisibility(r12)
            lr1.a r6 = r0.f312858q
            r6.setVisibility(r8)
            kr1.k r6 = r0.f312854j
            r6.setVisibility(r12)
            kr1.r r6 = r0.f312862u
            r6.mo160176d(r5)
            lr1.a r6 = r0.f312858q
            boolean r6 = r6.f174589g
            if (r6 == 0) goto L_0x0916
            java.lang.String r6 = "KEY_SUB_VIDEO_RECORD_CLICK_INT"
            r7 = 0
            r8 = 2
            th2.C110992d.m151314c(r4, r6, r5, r8, r7)
            r30 = 228(0xe4, double:1.126E-321)
            r32 = 1
            r28 = 1371(0x55b, double:6.774E-321)
            r34 = 0
            r27 = r3
            r27.idkeyStat(r28, r30, r32, r34)
            kr1.a r3 = r0.f312861t
            long r4 = r0.f312847F
            ph2.c r3 = r3.f326543f
            if (r3 == 0) goto L_0x092c
            r3.mo161627e(r4)
            goto L_0x092c
        L_0x0916:
            r30 = 210(0xd2, double:1.04E-321)
            r32 = 1
            r28 = 1371(0x55b, double:6.774E-321)
            r34 = 0
            r27 = r3
            r27.idkeyStat(r28, r30, r32, r34)
            kr1.a r3 = r0.f312861t
            ph2.c r3 = r3.f326543f
            if (r3 == 0) goto L_0x092c
            r3.mo161627e(r13)
        L_0x092c:
            kr1.a r3 = r0.f312861t
            r3.mo160158c()
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0935:
            if (r2 == 0) goto L_0x093f
            java.lang.String r3 = "PARAM_POINT_X"
            float r3 = r2.getFloat(r3)
            r5 = r3
            goto L_0x0940
        L_0x093f:
            r5 = 0
        L_0x0940:
            if (r2 == 0) goto L_0x094a
            java.lang.String r3 = "PARAM_POINT_Y"
            float r9 = r2.getFloat(r3)
            r6 = r9
            goto L_0x094b
        L_0x094a:
            r6 = 0
        L_0x094b:
            f90.b r4 = r0.f312867z
            if (r4 == 0) goto L_0x09d3
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r3 = r0.f312852h
            int r7 = r3.getWidth()
            com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView r3 = r0.f312852h
            int r8 = r3.getHeight()
            r9 = 400(0x190, double:1.976E-321)
            r4.mo157930c(r5, r6, r7, r8, r9)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0964:
            f90.b r3 = r0.f312867z
            if (r3 == 0) goto L_0x096d
            boolean r6 = r3.mo157939m(r5)
            goto L_0x096e
        L_0x096d:
            r6 = 1
        L_0x096e:
            r0.f312848G = r6
            kr1.b r3 = r0.f312857p
            f90.b r4 = r0.f312867z
            if (r4 == 0) goto L_0x0978
            boolean r5 = r4.f321646f
        L_0x0978:
            r3.f326566h = r5
            boolean r4 = r3.f326565g
            if (r4 == 0) goto L_0x0988
            if (r5 == 0) goto L_0x0983
            boolean r4 = r3.f326567i
            goto L_0x0985
        L_0x0983:
            boolean r4 = r3.f326568j
        L_0x0985:
            r3.mo160170i(r4)
        L_0x0988:
            lh2.x0 r3 = r0.f312855n
            boolean r4 = r0.f312848G
            r6 = 1
            r4 = r4 ^ r6
            r3.mo138905a(r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x0994:
            if (r2 == 0) goto L_0x09b3
            f90.b r3 = r0.f312867z
            if (r3 == 0) goto L_0x09b1
            java.lang.String r4 = "PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN"
            boolean r4 = r2.getBoolean(r4, r5)
            java.lang.String r5 = "PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN"
            boolean r5 = r2.getBoolean(r5, r6)
            java.lang.String r6 = "PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT"
            int r6 = r2.getInt(r6)
            r3.mo157942p(r4, r5, r6)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09b1:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09b3:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x09d3
        L_0x09b6:
            if (r2 == 0) goto L_0x09d1
            f90.b r3 = r0.f312867z
            if (r3 == 0) goto L_0x09cf
            java.lang.String r4 = "PARAM_PREPARE_CAMERA_ZOOM_LOCATION_INT"
            int r4 = r2.getInt(r4)
            int r5 = r3.f321652l
            if (r5 != 0) goto L_0x09cd
            y80.g r3 = r3.f321642b
            r5 = 10
            r3.mo143172k(r4, r5)
        L_0x09cd:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09cf:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09d1:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x09d3:
            java.lang.Class<y23.i> r3 = y23.C112389i.class
            lh2.g0 r3 = r0.mo151221j(r3)
            y23.i r3 = (y23.C112389i) r3
            if (r3 == 0) goto L_0x09e2
            r3.mo14585p(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x09e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderRecordPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    /* renamed from: q */
    public final void mo149744q(boolean z) {
        String str;
        Bundle bundle;
        MultiMediaEditInfoStruct multiMediaEditInfoStruct = new MultiMediaEditInfoStruct();
        RecordConfigProvider recordConfigProvider = this.f312843B;
        if (recordConfigProvider == null || (bundle = recordConfigProvider.f272912M) == null || (str = bundle.getString("post_id")) == null) {
            str = "";
        }
        multiMediaEditInfoStruct.f310214d = multiMediaEditInfoStruct.mo86045b("PostId", str, true);
        multiMediaEditInfoStruct.f310215e = multiMediaEditInfoStruct.mo86045b("EditId", this.f312851J, true);
        multiMediaEditInfoStruct.f310230t = z ? 2 : 1;
        multiMediaEditInfoStruct.f310213D = 99;
        multiMediaEditInfoStruct.f310212C = multiMediaEditInfoStruct.mo86045b("BeautyInfo", this.f312857p.f326573r.f318439I, true);
        multiMediaEditInfoStruct.mo86054n();
    }

    /* renamed from: r */
    public final void mo149745r(boolean z) {
        C103355g1 g1Var;
        C103360i1 i1Var;
        C110777a.C110778a aVar;
        int i;
        C104289g gVar;
        FinderRecordProfileReportStruct finderRecordProfileReportStruct = new FinderRecordProfileReportStruct();
        int i2 = 2;
        finderRecordProfileReportStruct.f310175n = z ? 2 : 1;
        C107509b bVar = this.f312867z;
        if (!(bVar == null || (gVar = bVar.f321661u) == null)) {
            finderRecordProfileReportStruct.f310165d = gVar.optLong("CameraOpenCost");
            finderRecordProfileReportStruct.f310168g = gVar.optLong("REPORT_CREATE_RECORDER");
            finderRecordProfileReportStruct.f310166e = gVar.optLong("CameraFirstFrameCost");
            if (!gVar.optBoolean("isUseCamera2")) {
                i2 = 1;
            }
            finderRecordProfileReportStruct.f310167f = i2;
            finderRecordProfileReportStruct.f310169h = gVar.optLong("HighRecordStopWaitTime");
        }
        C98178b bVar2 = this.f312866y;
        C110790c cVar = null;
        C110777a previewRenderer = bVar2 != null ? bVar2.getPreviewRenderer() : null;
        if (previewRenderer instanceof C110790c) {
            cVar = (C110790c) previewRenderer;
        }
        long j = 0;
        if (!(cVar == null || (aVar = cVar.f331391p) == null)) {
            long j2 = aVar.f331398d;
            int i3 = 0;
            if (j2 > 0 && (i = aVar.f331396b) != 0) {
                long j3 = aVar.f331399e - j2;
                if (j3 > 0) {
                    i3 = C60641c.m70921b((((float) i) * 1000.0f) / ((float) j3));
                }
            }
            finderRecordProfileReportStruct.f310170i = (long) i3;
            int i4 = aVar.f331396b;
            finderRecordProfileReportStruct.f310171j = i4 == 0 ? 0 : aVar.f331395a / ((long) i4);
        }
        if (!(cVar == null || (g1Var = cVar.f331427v) == null || (i1Var = g1Var.f304776E) == null)) {
            finderRecordProfileReportStruct.f310172k = i1Var.f304808a;
            int i5 = i1Var.f304810c;
            finderRecordProfileReportStruct.f310173l = i5 == 0 ? 0 : i1Var.f304809b / ((long) i5);
            int i6 = i1Var.f304812e;
            if (i6 != 0) {
                j = i1Var.f304811d / ((long) i6);
            }
            finderRecordProfileReportStruct.f310171j = j;
            finderRecordProfileReportStruct.f310174m = (long) i1Var.f304813f;
        }
        finderRecordProfileReportStruct.mo86054n();
    }

    public void release() {
        super.release();
        Log.m105924i("Finder.FinderRecordPluginLayout", "release");
        C107509b bVar = this.f312867z;
        if (bVar != null) {
            bVar.mo157931d();
        }
        C98607d dVar = this.f312844C;
        if (dVar != null) {
            dVar.disable();
        }
        C98607d dVar2 = this.f312844C;
        if (dVar2 != null) {
            dVar2.f289116g = null;
        }
        this.f312844C = null;
        RecordConfigProvider recordConfigProvider = this.f312843B;
        boolean z = false;
        if (recordConfigProvider != null && !recordConfigProvider.f272937y) {
            z = true;
        }
        if (z) {
            ((C119157j) C119157j.f356862d).mo183870a(new C105301h(this));
        }
    }

    /* renamed from: t */
    public final void mo149746t(boolean z) {
        C98178b bVar = this.f312866y;
        if (bVar != null) {
            bVar.f287123i = !z;
        }
        C107509b bVar2 = this.f312867z;
        if (bVar2 != null) {
            bVar2.mo157932e();
        }
        if (z) {
            this.f312853i.mo160526a();
        } else {
            this.f312853i.mo160532h(new C3912n(this));
        }
    }
}
