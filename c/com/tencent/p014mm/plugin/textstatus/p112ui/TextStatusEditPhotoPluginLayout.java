package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.EditPhotoPluginLayout;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98324b;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import me3.C109612c;
import me3.C109623f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "", "path", "Lrx3/b0;", "setOutputSize", "", "getLayoutId", "Landroid/widget/RelativeLayout;", "w", "Lrx3/g;", "getSinghtBtnContainer", "()Landroid/widget/RelativeLayout;", "singhtBtnContainer", "Landroid/widget/ImageView;", "x", "getRevertBtn", "()Landroid/widget/ImageView;", "revertBtn", "y", "getSendBtn", "sendBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout */
public final class TextStatusEditPhotoPluginLayout extends EditPhotoPluginLayout {

    /* renamed from: z */
    public static final /* synthetic */ int f316334z = 0;

    /* renamed from: w */
    public final C13601g f316335w = C36568h.m40985a(new C106176e(this));

    /* renamed from: x */
    public final C13601g f316336x = C36568h.m40985a(new C106174c(this));

    /* renamed from: y */
    public final C13601g f316337y = C36568h.m40985a(new C106175d(this));

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout$a */
    public static final class C106172a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditPhotoPluginLayout f316338d;

        public C106172a(TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout) {
            this.f316338d = textStatusEditPhotoPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout$loadCurrentPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout = this.f316338d;
            int i = TextStatusEditPhotoPluginLayout.f316334z;
            textStatusEditPhotoPluginLayout.getBackToRecordPlugin().onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout$loadCurrentPage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout$b */
    public static final class C106173b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditPhotoPluginLayout f316339d;

        public C106173b(TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout) {
            this.f316339d = textStatusEditPhotoPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout$loadCurrentPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout = this.f316339d;
            int i = TextStatusEditPhotoPluginLayout.f316334z;
            textStatusEditPhotoPluginLayout.getEditFinishPlugin().onClick(view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout$loadCurrentPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout$c */
    public static final class C106174c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditPhotoPluginLayout f316340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106174c(TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout) {
            super(0);
            this.f316340d = textStatusEditPhotoPluginLayout;
        }

        public Object invoke() {
            return (ImageView) this.f316340d.findViewById(C0966R.C0970id.jky);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout$d */
    public static final class C106175d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditPhotoPluginLayout f316341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106175d(TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout) {
            super(0);
            this.f316341d = textStatusEditPhotoPluginLayout;
        }

        public Object invoke() {
            return (ImageView) this.f316341d.findViewById(C0966R.C0970id.jkz);
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusEditPhotoPluginLayout$e */
    public static final class C106176e extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusEditPhotoPluginLayout f316342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106176e(TextStatusEditPhotoPluginLayout textStatusEditPhotoPluginLayout) {
            super(0);
            this.f316342d = textStatusEditPhotoPluginLayout;
        }

        public Object invoke() {
            return (RelativeLayout) this.f316342d.findViewById(C0966R.C0970id.jkx);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusEditPhotoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final ImageView getRevertBtn() {
        Object value = ((C36570n) this.f316336x).getValue();
        C87412m.m108593f(value, "<get-revertBtn>(...)");
        return (ImageView) value;
    }

    private final ImageView getSendBtn() {
        Object value = ((C36570n) this.f316337y).getValue();
        C87412m.m108593f(value, "<get-sendBtn>(...)");
        return (ImageView) value;
    }

    private final RelativeLayout getSinghtBtnContainer() {
        Object value = ((C36570n) this.f316335w).getValue();
        C87412m.m108593f(value, "<get-singhtBtnContainer>(...)");
        return (RelativeLayout) value;
    }

    private final void setOutputSize(String str) {
        int i;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            Log.m105924i("MicroMsg.TextStatusEditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_text_state_image_size, 1920);
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > i4) {
            i = (i4 * Qe) / i3;
            i2 = Qe;
        } else {
            i2 = (i3 * Qe) / i4;
            i = Qe;
        }
        Log.m105924i("MicroMsg.TextStatusEditPhotoPluginLayout", "setOutputSize config[" + Qe + "] origin[" + options.outWidth + ',' + options.outHeight + "] target[" + i2 + ',' + i + ']');
        C109623f fVar = getEditPhotoWrapper().f327415o;
        if (fVar != null) {
            ((C109612c) fVar).mo160833q(i2, i);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9l;
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        getEditPencilPlugin().f327450h.setVisibility(4);
        getAddEmojiPlugin().setVisibility(4);
        getEditAddTextPlugin().setVisibility(4);
        getEditCropPhotoPlugin().f291645d.setVisibility(4);
        getBackToRecordPlugin().setVisibility(4);
        getSinghtBtnContainer().setVisibility(0);
        getRevertBtn().setOnClickListener(new C106172a(this));
        getSendBtn().setOnClickListener(new C106173b(this));
        super.mo129855l(bVar);
        C87412m.m108591d(bVar);
        setOutputSize(bVar.f288189j);
    }

    public void onAttach() {
        super.onAttach();
        View view = getEditFinishPlugin().f291584d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditPhotoPluginLayout", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
