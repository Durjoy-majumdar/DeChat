package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraActionsLogStruct;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import e80.C107254b;
import e80.C107256d;
import e80.C107257e;
import e80.C107258f;
import e80.C107259g;
import e80.C107260h;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import lh2.C109337b;
import rx3.C13598b0;
import th2.C110990b;
import th2.C110992d;
import wg2.C102440a;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/ImproveCameraKitPluginLayout;", "", "visible", "Lrx3/b0;", "setPluginViewVisible", "setPluginVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout */
public final class ImproveShieldCameraKitPluginLayout extends ImproveCameraKitPluginLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveShieldCameraKitPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: B */
    public void mo151255B() {
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        ((WeImageView) findViewById(C0966R.C0970id.f358296l72)).setVisibility(4);
    }

    public void onAttach() {
        super.onAttach();
        CameraActionsLogStruct cameraActionsLogStruct = C110990b.f332422a;
        if (cameraActionsLogStruct != null) {
            cameraActionsLogStruct.f310050u = 2;
        }
    }

    /* renamed from: r */
    public Object mo151234r(boolean z, C15601d<? super C13598b0> dVar) {
        getCameraSwitchPlugin().mo138905a(z);
        C110992d.f332425a.mo162677k("KEY_MEDIA_SOURCE_INT", new Integer(z ? 1 : 2));
        return C13598b0.f38549a;
    }

    public void setPluginViewVisible(int i) {
        getClosePlugin().setVisibility(i);
        getCameraSwitchPlugin().f291647d.setVisibility(i);
        C109337b recordPlugin = getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.setVisibility(i);
        }
    }

    public void setPluginVisibility(int i) {
        if (i == 0) {
            View cameraView = getCameraView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = cameraView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cameraView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/parent/ImproveShieldCameraKitPluginLayout", "setPluginVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: w */
    public void mo151239w() {
        Bundle bundle;
        Bundle bundle2;
        RecordConfigProvider configProvider = getConfigProvider();
        int i = -1;
        int i2 = configProvider != null ? configProvider.f272905F : -1;
        RecordConfigProvider configProvider2 = getConfigProvider();
        if (!(configProvider2 == null || (bundle2 = configProvider2.f272912M) == null)) {
            i = bundle2.getInt("key_sub_scene", -1);
        }
        RecordConfigProvider configProvider3 = getConfigProvider();
        getCameraUsage().setCameraKitSetting(new C107259g(new C107260h(C76577a.m92153d(getContext(), C0966R.color.f2975b6), false, 2, (C8480h) null), new C107254b(0, 0, (C107256d) null, (C107257e) null, ((configProvider3 == null || (bundle = configProvider3.f272912M) == null) ? 2 : bundle.getInt("key_camera_select", 2)) == 2, false, false, false, 15, (C8480h) null), new C107258f(i2, i)));
    }
}
