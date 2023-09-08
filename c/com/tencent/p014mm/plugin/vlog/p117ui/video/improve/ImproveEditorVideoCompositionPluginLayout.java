package com.tencent.p014mm.plugin.vlog.p117ui.video.improve;

import a33.C91954f;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.vlog.p117ui.video.EditorVideoCompositionPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vg2.C78414c;
import wg2.C102440a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout;", "Lcom/tencent/mm/plugin/vlog/ui/video/EditorVideoCompositionPluginLayout;", "Landroid/view/View;", "J", "Lrx3/g;", "getCloseView", "()Landroid/view/View;", "closeView", "K", "getFuncBottomParent", "funcBottomParent", "Landroid/widget/Button;", "L", "getFinishBtn", "()Landroid/widget/Button;", "finishBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout */
public final class ImproveEditorVideoCompositionPluginLayout extends EditorVideoCompositionPluginLayout {

    /* renamed from: J */
    public final C13601g f316984J = C36568h.m40985a(new C106294b(this));

    /* renamed from: K */
    public final C13601g f316985K = C36568h.m40985a(new C106296d(this));

    /* renamed from: L */
    public final C13601g f316986L = C36568h.m40985a(new C106295c(this));

    /* renamed from: M */
    public boolean f316987M;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout$a */
    public static final class C106293a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditorVideoCompositionPluginLayout f316988d;

        public C106293a(ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
            this.f316988d = improveEditorVideoCompositionPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ImproveEditorVideoCompositionPluginLayout.m143054q(this.f316988d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout$b */
    public static final class C106294b extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditorVideoCompositionPluginLayout f316989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106294b(ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
            super(0);
            this.f316989d = improveEditorVideoCompositionPluginLayout;
        }

        public Object invoke() {
            return this.f316989d.findViewById(C0966R.C0970id.cc8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout$c */
    public static final class C106295c extends C87413o implements C32224a<Button> {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditorVideoCompositionPluginLayout f316990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106295c(ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
            super(0);
            this.f316990d = improveEditorVideoCompositionPluginLayout;
        }

        public Object invoke() {
            return (Button) this.f316990d.findViewById(C0966R.C0970id.cco);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout$d */
    public static final class C106296d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ImproveEditorVideoCompositionPluginLayout f316991d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106296d(ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
            super(0);
            this.f316991d = improveEditorVideoCompositionPluginLayout;
        }

        public Object invoke() {
            return this.f316991d.findViewById(C0966R.C0970id.ehd);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImproveEditorVideoCompositionPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOnClickListener(new C106293a(this));
    }

    private final View getCloseView() {
        Object value = ((C36570n) this.f316984J).getValue();
        C87412m.m108593f(value, "<get-closeView>(...)");
        return (View) value;
    }

    private final Button getFinishBtn() {
        Object value = ((C36570n) this.f316986L).getValue();
        C87412m.m108593f(value, "<get-finishBtn>(...)");
        return (Button) value;
    }

    private final View getFuncBottomParent() {
        Object value = ((C36570n) this.f316985K).getValue();
        C87412m.m108593f(value, "<get-funcBottomParent>(...)");
        return (View) value;
    }

    /* renamed from: q */
    public static final void m143054q(ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout) {
        ImproveEditorVideoCompositionPluginLayout improveEditorVideoCompositionPluginLayout2 = improveEditorVideoCompositionPluginLayout;
        if (improveEditorVideoCompositionPluginLayout.getFuncBottomParent().getVisibility() == 0 && improveEditorVideoCompositionPluginLayout.getCloseView().getVisibility() == 0) {
            View funcBottomParent = improveEditorVideoCompositionPluginLayout.getFuncBottomParent();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = funcBottomParent;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View closeView = improveEditorVideoCompositionPluginLayout.getCloseView();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view2 = closeView;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            improveEditorVideoCompositionPluginLayout2.f316987M = true;
        } else if (improveEditorVideoCompositionPluginLayout2.f316987M) {
            View funcBottomParent2 = improveEditorVideoCompositionPluginLayout.getFuncBottomParent();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            C117292a.m165358d(funcBottomParent2, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            funcBottomParent2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(funcBottomParent2, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View closeView2 = improveEditorVideoCompositionPluginLayout.getCloseView();
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view3 = closeView2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            closeView2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "onClickToChangeUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            improveEditorVideoCompositionPluginLayout2.f316987M = false;
        }
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        View funcBottomParent = getFuncBottomParent();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(funcBottomParent, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "initLogic", "(Lcom/tencent/mm/plugin/recordvideo/activity/IRecordUINavigation;Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        funcBottomParent.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(funcBottomParent, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "initLogic", "(Lcom/tencent/mm/plugin/recordvideo/activity/IRecordUINavigation;Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View closeView = getCloseView();
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view = closeView;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "initLogic", "(Lcom/tencent/mm/plugin/recordvideo/activity/IRecordUINavigation;Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        closeView.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "initLogic", "(Lcom/tencent/mm/plugin/recordvideo/activity/IRecordUINavigation;Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.mo128671k(aVar, recordConfigProvider);
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        RecordConfigProvider configProvider = getConfigProvider();
        Bundle bundle = configProvider != null ? configProvider.f272912M : null;
        if (bundle != null) {
            int i = bundle.getInt("key_preview_location_type", -1);
            int i2 = bundle.getInt("key_preview_margin_top", -1);
            int i3 = bundle.getInt("key_back_margin_top", -1);
            int i4 = bundle.getInt("key_edit_control_margin_bottom", -1);
            Log.m105924i("MicroMsg.ImproveEditorVideoCompositionPluginLayout", "changeUILocation >> previewLocationType: " + i + ", previewMarginTop: " + i2 + ", closeMarginTop: " + i3 + ", editControlMarginBottom: " + i4);
            if (!(i == -1 || i2 == -1 || i3 == -1 || i4 == -1)) {
                ViewGroup.LayoutParams layoutParams = getCloseView().getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int a = i3 - C74942w4.m89784a(getContext(), 6);
                if (a > 0) {
                    layoutParams2.topMargin = a;
                    getCloseView().setLayoutParams(layoutParams2);
                }
                ViewGroup.LayoutParams layoutParams3 = getFuncBottomParent().getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                int a2 = i4 - C74942w4.m89784a(getContext(), 40);
                int a3 = a2 - C74942w4.m89784a(getContext(), 6);
                Log.m105924i("MicroMsg.ImproveEditorVideoCompositionPluginLayout", "changeEditControlLocation >> " + a2 + ", " + a3);
                if (a3 > 0) {
                    layoutParams4.bottomMargin = a3;
                    getFuncBottomParent().setLayoutParams(layoutParams4);
                }
                C91954f mediaModel = getMediaModel();
                mediaModel.getClass();
                Log.m105924i("MicroMsg.MediaModel", "setPreviewLocationOffset >> previewType: " + i + ", topMargin: " + i2);
                mediaModel.f263267l = i2;
                mediaModel.f263268m = i;
            }
        }
        ViewGroup.LayoutParams layoutParams5 = getFinishBtn().getLayoutParams();
        C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        float dimension = getResources().getDimension(C0966R.dimen.al9);
        float dimension2 = getResources().getDimension(C0966R.dimen.f3705bx);
        float dimension3 = getResources().getDimension(C0966R.dimen.f3723cd);
        C78414c cVar = C78414c.f229758a;
        Context context = getFinishBtn().getContext();
        C87412m.m108593f(context, "finishBtn.context");
        int a4 = (int) cVar.mo108364a(context, dimension3);
        float dimension4 = getResources().getDimension(C0966R.dimen.a2o);
        float dimension5 = getResources().getDimension(C0966R.dimen.a2p);
        getFinishBtn().setPadding(a4, 0, a4, 0);
        getFinishBtn().setTextSize(0, (float) C76577a.m92155f(getFinishBtn().getContext(), C0966R.dimen.f3927j7));
        Context context2 = getFinishBtn().getContext();
        C87412m.m108593f(context2, "finishBtn.context");
        layoutParams6.width = (int) cVar.mo108364a(context2, dimension2);
        Context context3 = getFinishBtn().getContext();
        C87412m.m108593f(context3, "finishBtn.context");
        layoutParams6.height = (int) cVar.mo108364a(context3, dimension);
        Context context4 = getFinishBtn().getContext();
        C87412m.m108593f(context4, "finishBtn.context");
        layoutParams6.leftMargin = (int) cVar.mo108364a(context4, dimension4);
        Context context5 = getFinishBtn().getContext();
        C87412m.m108593f(context5, "finishBtn.context");
        layoutParams6.rightMargin = (int) cVar.mo108364a(context5, dimension5);
        getFinishBtn().setLayoutParams(layoutParams6);
        int dimension6 = (int) getResources().getDimension(C0966R.dimen.aba);
        int dimension7 = (int) getResources().getDimension(C0966R.dimen.a2q);
        int dimension8 = (int) getResources().getDimension(C0966R.dimen.al9);
        View findViewById = findViewById(C0966R.C0970id.cbo);
        C87412m.m108593f(findViewById, "findViewById<View>(com.t…d.editor_add_audio_group)");
        cVar.mo108366c(findViewById, dimension6, dimension7, dimension8);
        View findViewById2 = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById2, "findViewById<View>(com.t…eo.R.id.editor_add_emoji)");
        cVar.mo108366c(findViewById2, dimension6, dimension7, dimension8);
        View findViewById3 = findViewById(C0966R.C0970id.f357898cc2);
        C87412m.m108593f(findViewById3, "findViewById<View>(com.t…deo.R.id.editor_add_text)");
        cVar.mo108366c(findViewById3, dimension6, dimension7, dimension8);
        View findViewById4 = findViewById(C0966R.C0970id.ccb);
        C87412m.m108593f(findViewById4, "findViewById<View>(com.t…o.R.id.editor_crop_video)");
        cVar.mo108366c(findViewById4, dimension6, dimension7, dimension8);
        View funcBottomParent = getFuncBottomParent();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = funcBottomParent;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        funcBottomParent.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View closeView = getCloseView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(closeView, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        closeView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(closeView, "com/tencent/mm/plugin/vlog/ui/video/improve/ImproveEditorVideoCompositionPluginLayout", "loadCurrentPage", "(Lcom/tencent/mm/media/widget/camerarecordview/data/MediaCaptureInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.mo129855l(bVar);
        this.f316987M = false;
    }
}
