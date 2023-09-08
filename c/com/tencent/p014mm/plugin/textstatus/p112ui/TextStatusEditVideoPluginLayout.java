package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditorVideoPluginLayoutNew;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98324b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p143ds.C58434o;
import p625nu.C100196e;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditorVideoPluginLayoutNew;", "", "getLayoutId", "Landroid/widget/RelativeLayout;", "E", "Lrx3/g;", "getSinghtBtnContainer", "()Landroid/widget/RelativeLayout;", "singhtBtnContainer", "Landroid/widget/ImageView;", "F", "getRevertBtn", "()Landroid/widget/ImageView;", "revertBtn", "G", "getSendBtn", "sendBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout */
public final class TextStatusEditVideoPluginLayout extends EditorVideoPluginLayoutNew {

    /* renamed from: H */
    public static final /* synthetic */ int f316343H = 0;

    /* renamed from: E */
    public final C13601g f316344E = C36568h.m40985a(new C106180d(this));

    /* renamed from: F */
    public final C13601g f316345F = C36568h.m40985a(new C106178b(this));

    /* renamed from: G */
    public final C13601g f316346G = C36568h.m40985a(new C106179c(this));

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout$a */
    public static final class C106177a extends C87413o implements C32228q<String, String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98324b f316347d;

        /* renamed from: e */
        public final /* synthetic */ TextStatusEditVideoPluginLayout f316348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106177a(C98324b bVar, TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
            super(3);
            this.f316347d = bVar;
            this.f316348e = textStatusEditVideoPluginLayout;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int i;
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            C87412m.m108594g((String) obj, "mixVideo");
            C87412m.m108594g(str, "mixThumb");
            Log.m105924i("MicroMsg.TextStatusEditVideoPluginLayout", "is in main thread:" + MMHandlerThread.isMainThread());
            if (booleanValue) {
                C98324b bVar = this.f316347d;
                if (C86013q1.m106450k(bVar != null ? bVar.f288180a : null)) {
                    C98324b bVar2 = this.f316347d;
                    C87412m.m108591d(bVar2);
                    C94554a M1 = ((C58434o) C86312j.m106911c(C58434o.class)).mo82774M1(bVar2.f288180a);
                    int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_text_state_image_size, 1920);
                    int i2 = M1.f273445c;
                    int i3 = M1.f273446d;
                    if (i2 > i3) {
                        int i4 = (i3 * Qe) / i2;
                        i = Qe;
                        Qe = i4;
                    } else {
                        i = (i2 * Qe) / i3;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("outputHeight:");
                    sb.append(Qe);
                    sb.append(" outputWidth:");
                    sb.append(i);
                    sb.append(" startTime:");
                    TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout = this.f316348e;
                    int i5 = TextStatusEditVideoPluginLayout.f316343H;
                    sb.append(textStatusEditVideoPluginLayout.getPreviewPlugin().f327330o);
                    Log.m105924i("MicroMsg.TextStatusEditVideoPluginLayout", sb.toString());
                    Bitmap a002 = ((C100196e) C86312j.m106911c(C100196e.class)).a00(this.f316347d.f288180a, (long) this.f316348e.getPreviewPlugin().f327330o);
                    if (Qe < M1.f273446d || i < M1.f273445c) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a002, i, Qe, true);
                        a002.recycle();
                        a002 = createScaledBitmap;
                    }
                    if (a002 != null) {
                        C86013q1.m106447h(str);
                        BitmapUtil.saveBitmapToImage(a002, 100, Bitmap.CompressFormat.JPEG, str, true);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout$b */
    public static final class C106178b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditVideoPluginLayout f316349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106178b(TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
            super(0);
            this.f316349d = textStatusEditVideoPluginLayout;
        }

        public Object invoke() {
            return (ImageView) this.f316349d.findViewById(C0966R.C0970id.jky);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout$c */
    public static final class C106179c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditVideoPluginLayout f316350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106179c(TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
            super(0);
            this.f316350d = textStatusEditVideoPluginLayout;
        }

        public Object invoke() {
            return (ImageView) this.f316350d.findViewById(C0966R.C0970id.jkz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout$d */
    public static final class C106180d extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditVideoPluginLayout f316351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106180d(TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
            super(0);
            this.f316351d = textStatusEditVideoPluginLayout;
        }

        public Object invoke() {
            return (RelativeLayout) this.f316351d.findViewById(C0966R.C0970id.jkx);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout$e */
    public static final class C106181e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditVideoPluginLayout f316352d;

        public C106181e(TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
            this.f316352d = textStatusEditVideoPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout = this.f316352d;
            int i = TextStatusEditVideoPluginLayout.f316343H;
            textStatusEditVideoPluginLayout.getBackToRecordPlugin().onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout$f */
    public static final class C106182f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditVideoPluginLayout f316353d;

        public C106182f(TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
            this.f316353d = textStatusEditVideoPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout = this.f316353d;
            int i = TextStatusEditVideoPluginLayout.f316343H;
            textStatusEditVideoPluginLayout.getEditFinishPlugin().onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout$statusChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusEditVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final ImageView getRevertBtn() {
        Object value = ((C36570n) this.f316345F).getValue();
        C87412m.m108593f(value, "<get-revertBtn>(...)");
        return (ImageView) value;
    }

    private final ImageView getSendBtn() {
        Object value = ((C36570n) this.f316346G).getValue();
        C87412m.m108593f(value, "<get-sendBtn>(...)");
        return (ImageView) value;
    }

    private final RelativeLayout getSinghtBtnContainer() {
        Object value = ((C36570n) this.f316344E).getValue();
        C87412m.m108593f(value, "<get-singhtBtnContainer>(...)");
        return (RelativeLayout) value;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c_6;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        getReMuxPlugin().f291536n = new C106177a(bVar, this);
        getAddEmojiPlugin().setVisibility(4);
        getAddTextPlugin().setVisibility(4);
        getAddMusicPlugin().setVisibility(4);
        getCropVideoPlugin().f292721f.setVisibility(4);
        View view = getEditFinishPlugin().f291584d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "setInvisiblePlugin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "setInvisiblePlugin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getBackToRecordPlugin().setVisibility(4);
        super.mo129855l(bVar);
    }

    public void onAttach() {
        super.onAttach();
        View view = getEditFinishPlugin().f291584d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditVideoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 60) {
            super.mo14585p(C101198e.C101199b.EDIT_START_MUX, bundle);
        } else if (ordinal != 63) {
            super.mo14585p(bVar, bundle);
        } else {
            super.mo14585p(bVar, bundle);
            if (bundle != null && !bundle.getBoolean("PARAM_VIDEO_NEED_CROP")) {
                getSinghtBtnContainer().setVisibility(0);
                getRevertBtn().setOnClickListener(new C106181e(this));
                getSendBtn().setOnClickListener(new C106182f(this));
                return;
            }
            getSinghtBtnContainer().setVisibility(4);
        }
    }
}
