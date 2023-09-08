package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.p077ui.MMSightTopCountdownCoverView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0014R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AppBrandRecordPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "", "getLayoutId", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView;", "kotlin.jvm.PlatformType", "A", "Lrx3/g;", "getTopCountdownCover", "()Lcom/tencent/mm/plugin/mmsight/ui/MMSightTopCountdownCoverView;", "topCountdownCover", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout */
public final class AppBrandRecordPluginLayout extends CameraKitPluginLayout {

    /* renamed from: A */
    public final C13601g f272949A = C36568h.m40985a(new C42803a(this));

    /* renamed from: B */
    public boolean f272950B;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.AppBrandRecordPluginLayout$a */
    public static final class C42803a extends C87413o implements C32224a<MMSightTopCountdownCoverView> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandRecordPluginLayout f115891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42803a(AppBrandRecordPluginLayout appBrandRecordPluginLayout) {
            super(0);
            this.f115891d = appBrandRecordPluginLayout;
        }

        public Object invoke() {
            MMSightTopCountdownCoverView mMSightTopCountdownCoverView = (MMSightTopCountdownCoverView) this.f115891d.findViewById(C0966R.C0970id.kra);
            if (C85875k4.m106205t(this.f115891d.getContext(), false)) {
                ViewGroup.LayoutParams layoutParams = mMSightTopCountdownCoverView.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.height = C85875k4.m106198o(this.f115891d.getContext()) + this.f115891d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.agg);
                mMSightTopCountdownCoverView.setLayoutParams(layoutParams2);
            }
            return mMSightTopCountdownCoverView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandRecordPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final MMSightTopCountdownCoverView getTopCountdownCover() {
        return (MMSightTopCountdownCoverView) ((C36570n) this.f272949A).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cua;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        this.f272950B = recordConfigProvider.f272912M.getBoolean("key_show_top_countdown_cover", false);
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 5) {
            RecordConfigProvider configProvider = getConfigProvider();
            if (configProvider != null) {
                if (this.f272950B) {
                    getTopCountdownCover().mo66663c((long) configProvider.f272926n.f267170h);
                }
            } else {
                return;
            }
        } else if (ordinal == 6 && this.f272950B) {
            getTopCountdownCover().mo66662b();
        }
        super.mo14585p(bVar, bundle);
    }
}
