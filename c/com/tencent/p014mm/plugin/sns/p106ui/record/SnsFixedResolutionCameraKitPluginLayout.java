package com.tencent.p014mm.plugin.sns.p106ui.record;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.media.camera.view.CameraKitView;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gs2.C98192a;
import gs2.C98198g;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p1057w2.C111711b;
import p849e3.C107179f0;
import p849e3.C107207u;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\n8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00048FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "", "getLayoutId", "Landroid/view/View;", "A", "Lrx3/g;", "getOpBtnArea", "()Landroid/view/View;", "opBtnArea", "Lcom/tencent/mm/media/camera/view/CameraKitView;", "B", "getCameraView", "()Lcom/tencent/mm/media/camera/view/CameraKitView;", "cameraView", "C", "getRecordButton", "recordButton", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout */
public final class SnsFixedResolutionCameraKitPluginLayout extends CameraKitPluginLayout {

    /* renamed from: A */
    public final C13601g f281150A = C36568h.m40985a(new C96211b(this));

    /* renamed from: B */
    public final C13601g f281151B = C36568h.m40985a(new C96210a(this));

    /* renamed from: C */
    public final C13601g f281152C = C36568h.m40985a(new C96212c(this));

    /* renamed from: com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$a */
    public static final class C96210a extends C87413o implements C32224a<CameraKitView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFixedResolutionCameraKitPluginLayout f281153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96210a(SnsFixedResolutionCameraKitPluginLayout snsFixedResolutionCameraKitPluginLayout) {
            super(0);
            this.f281153d = snsFixedResolutionCameraKitPluginLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
            CameraKitView cameraKitView = (CameraKitView) this.f281153d.findViewById(C0966R.C0970id.apr);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$cameraView$2");
            return cameraKitView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$b */
    public static final class C96211b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ SnsFixedResolutionCameraKitPluginLayout f281154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96211b(SnsFixedResolutionCameraKitPluginLayout snsFixedResolutionCameraKitPluginLayout) {
            super(0);
            this.f281154d = snsFixedResolutionCameraKitPluginLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$opBtnArea$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$opBtnArea$2");
            View findViewById = this.f281154d.findViewById(C0966R.C0970id.nxi);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$opBtnArea$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$opBtnArea$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$c */
    public static final class C96212c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ SnsFixedResolutionCameraKitPluginLayout f281155d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96212c(SnsFixedResolutionCameraKitPluginLayout snsFixedResolutionCameraKitPluginLayout) {
            super(0);
            this.f281155d = snsFixedResolutionCameraKitPluginLayout;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$recordButton$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$recordButton$2");
            View findViewById = this.f281155d.findViewById(C0966R.C0970id.ih_);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$recordButton$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout$recordButton$2");
            return findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsFixedResolutionCameraKitPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo133886y();
    }

    /* renamed from: A */
    public final void mo133879A(boolean z) {
        int i;
        SnsMethodCalculate.markStartTimeMs("updateCaptureLayout", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        View recordButton = getRecordButton();
        RelativeLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = recordButton != null ? recordButton.getLayoutParams() : null;
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
        }
        if (z) {
            SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            int i2 = C98198g.f287919c;
            SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            i = C76577a.m92157h(getContext(), C0966R.dimen.f3754d5) + i2;
        } else {
            i = C76577a.m92157h(getContext(), C0966R.dimen.f3754d5);
        }
        if (layoutParams != null) {
            layoutParams.bottomMargin = i;
        }
        View recordButton2 = getRecordButton();
        if (recordButton2 != null) {
            recordButton2.setLayoutParams(layoutParams);
        }
        Log.m105924i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "updateCaptureLayout: willShowBehindNavigationBar:" + z + ", bottomMargin:" + i);
        SnsMethodCalculate.markEndTimeMs("updateCaptureLayout", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    /* renamed from: B */
    public final void mo133880B(int i) {
        SnsMethodCalculate.markStartTimeMs("updateOpButtonLayoutParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        View opBtnArea = getOpBtnArea();
        RelativeLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = opBtnArea != null ? opBtnArea.getLayoutParams() : null;
        if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
            layoutParams = (RelativeLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = i;
            View opBtnArea2 = getOpBtnArea();
            if (opBtnArea2 != null) {
                opBtnArea2.setLayoutParams(layoutParams);
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateOpButtonLayoutParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public final CameraKitView getCameraView() {
        SnsMethodCalculate.markStartTimeMs("getCameraView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        CameraKitView cameraKitView = (CameraKitView) ((C36570n) this.f281151B).getValue();
        SnsMethodCalculate.markEndTimeMs("getCameraView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return cameraKitView;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return C0966R.C0971layout.d5l;
    }

    public final View getOpBtnArea() {
        SnsMethodCalculate.markStartTimeMs("getOpBtnArea", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        View view = (View) ((C36570n) this.f281150A).getValue();
        SnsMethodCalculate.markEndTimeMs("getOpBtnArea", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return view;
    }

    public final View getRecordButton() {
        SnsMethodCalculate.markStartTimeMs("getRecordButton", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        View view = (View) ((C36570n) this.f281152C).getValue();
        SnsMethodCalculate.markEndTimeMs("getRecordButton", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return view;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        Log.m105924i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "initLogic: ");
        super.mo128671k(aVar, recordConfigProvider);
        SnsMethodCalculate.markStartTimeMs("updateRecordVideoParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        VideoTransPara videoTransPara = recordConfigProvider.f272926n;
        videoTransPara.f267167e = (videoTransPara.f267166d * 16) / 9;
        Log.m105924i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "updateRecordVideoParams width:" + videoTransPara.f267166d + " height:" + videoTransPara.f267167e);
        SnsMethodCalculate.markEndTimeMs("updateRecordVideoParams", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        super.onConfigurationChanged(configuration);
        StringBuilder sb = new StringBuilder();
        sb.append("onConfigurationChanged: orientation=");
        C111711b bVar = null;
        sb.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        Log.m105924i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", sb.toString());
        View recordButton = getRecordButton();
        int i = -1;
        if (recordButton != null) {
            C107179f0 e = C107207u.m145164e(recordButton);
            if (e != null) {
                bVar = e.f320766a.mo157644g(2);
            }
            if (bVar != null) {
                i = bVar.f334391d;
            }
        }
        C98198g gVar = C98198g.f287917a;
        SnsMethodCalculate.markStartTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        C98192a a = gVar.mo137499a(i);
        SnsMethodCalculate.markStartTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        C98198g.f287918b = a;
        SnsMethodCalculate.markEndTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        SnsMethodCalculate.markEndTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        mo133886y();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        Log.m105924i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "onResume: ");
        super.onResume();
        reset();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    /* renamed from: t */
    public boolean mo133885t() {
        SnsMethodCalculate.markStartTimeMs("enableRecordVideoFullScreen", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        SnsMethodCalculate.markEndTimeMs("enableRecordVideoFullScreen", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        return false;
    }

    /* renamed from: y */
    public final void mo133886y() {
        SnsMethodCalculate.markStartTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        SnsMethodCalculate.markStartTimeMs("getRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        C98192a aVar = C98198g.f287918b;
        SnsMethodCalculate.markEndTimeMs("getRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        SnsMethodCalculate.markStartTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        } else {
            Log.m105924i("MicroMsg.SnsFixedResolutionCameraKitPluginLayout", "initViewWithResolutionRadioConfig: radioConfig=" + aVar);
            int f = C75044y4.m89994f(getContext()) + C76577a.m92157h(getContext(), C0966R.dimen.f3736cp);
            SnsMethodCalculate.markStartTimeMs("getWillShowBehindStatusBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            boolean z = aVar.f287916b;
            SnsMethodCalculate.markEndTimeMs("getWillShowBehindStatusBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            RelativeLayout.LayoutParams layoutParams = null;
            if (z) {
                SnsMethodCalculate.markStartTimeMs("updateOpButtonShowInsideCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                CameraKitView cameraView = getCameraView();
                ViewGroup.LayoutParams layoutParams2 = cameraView != null ? cameraView.getLayoutParams() : null;
                RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 != null) {
                    layoutParams3.removeRule(3);
                    layoutParams3.addRule(10);
                    CameraKitView cameraView2 = getCameraView();
                    if (cameraView2 != null) {
                        cameraView2.setLayoutParams(layoutParams3);
                    }
                }
                View opBtnArea = getOpBtnArea();
                ViewGroup.LayoutParams layoutParams4 = opBtnArea != null ? opBtnArea.getLayoutParams() : null;
                if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams4;
                }
                if (layoutParams != null) {
                    CameraKitView cameraView3 = getCameraView();
                    layoutParams.addRule(6, cameraView3 != null ? cameraView3.getId() : 0);
                    View opBtnArea2 = getOpBtnArea();
                    if (opBtnArea2 != null) {
                        opBtnArea2.setLayoutParams(layoutParams);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("updateOpButtonShowInsideCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                mo133880B(f);
                mo133887z(true);
            } else {
                mo133880B(f);
                SnsMethodCalculate.markStartTimeMs("updateOpButtonShowAboveCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                View opBtnArea3 = getOpBtnArea();
                ViewGroup.LayoutParams layoutParams5 = opBtnArea3 != null ? opBtnArea3.getLayoutParams() : null;
                RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams5 : null;
                if (layoutParams6 != null) {
                    layoutParams6.removeRule(6);
                    View opBtnArea4 = getOpBtnArea();
                    if (opBtnArea4 != null) {
                        opBtnArea4.setLayoutParams(layoutParams6);
                    }
                }
                CameraKitView cameraView4 = getCameraView();
                ViewGroup.LayoutParams layoutParams7 = cameraView4 != null ? cameraView4.getLayoutParams() : null;
                if (layoutParams7 instanceof RelativeLayout.LayoutParams) {
                    layoutParams = (RelativeLayout.LayoutParams) layoutParams7;
                }
                if (layoutParams != null) {
                    layoutParams.removeRule(10);
                    View opBtnArea5 = getOpBtnArea();
                    layoutParams.addRule(3, opBtnArea5 != null ? opBtnArea5.getId() : 0);
                    CameraKitView cameraView5 = getCameraView();
                    if (cameraView5 != null) {
                        cameraView5.setLayoutParams(layoutParams);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("updateOpButtonShowAboveCamera", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
                mo133887z(false);
            }
            SnsMethodCalculate.markStartTimeMs("getWillShowBehindNavigationBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            boolean z2 = aVar.f287915a;
            SnsMethodCalculate.markEndTimeMs("getWillShowBehindNavigationBar", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsRecordResolutionRatioConfig");
            if (z2) {
                mo133879A(true);
            } else {
                mo133879A(false);
            }
            SnsMethodCalculate.markEndTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        }
        SnsMethodCalculate.markEndTimeMs("initViewWithResolutionRadioConfig", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }

    /* renamed from: z */
    public final void mo133887z(boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateCameraMaskView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
        View findViewById = findViewById(C0966R.C0970id.nsc);
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/record/SnsFixedResolutionCameraKitPluginLayout", "updateCameraMaskView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("updateCameraMaskView", "com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout");
    }
}
