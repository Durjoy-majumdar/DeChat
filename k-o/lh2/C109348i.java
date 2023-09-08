package lh2;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import p213oh.C11412b;
import p385u2.C111105a;
import pe3.C89349b;
import qh2.C101198e;
import rx3.C13598b0;
import te3.C64368fm;
import th2.C110992d;
import z04.C119027c;

/* renamed from: lh2.i */
public final class C109348i extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public ViewGroup f327358f;

    /* renamed from: g */
    public EditorInputView f327359g;

    /* renamed from: h */
    public final ImageView f327360h;

    /* renamed from: i */
    public final C64368fm f327361i = new C64368fm();

    /* renamed from: lh2.i$a */
    public static final class C109349a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f327362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109349a(C101198e eVar) {
            super(1);
            this.f327362d = eVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f327362d, C101198e.C101199b.EDIT_VIDEO_WITH_TEXT, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f327362d, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lh2.i$b */
    public static final class C109350b implements EditorInputView.C106032j {

        /* renamed from: a */
        public final /* synthetic */ C109348i f327363a;

        /* renamed from: b */
        public final /* synthetic */ C101198e f327364b;

        public C109350b(C109348i iVar, C101198e eVar) {
            this.f327363a = iVar;
            this.f327364b = eVar;
        }

        /* renamed from: a */
        public void mo151459a(CharSequence charSequence, int i, int i2, String str) {
            C87412m.m108594g(str, "font");
            if (charSequence != null) {
                if (!(charSequence.length() == 0)) {
                    Bundle bundle = new Bundle();
                    int mode = this.f327363a.f327359g.getMode();
                    if (mode == 0) {
                        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", charSequence.toString());
                        bundle.putInt("PARAM_EDIT_TEXT_COLOR", i);
                        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i2);
                        bundle.putString("PARAM_EDIT_TEXT_FONT", str);
                        this.f327364b.mo14585p(C101198e.C101199b.EDIT_ADD_TEXT, bundle);
                    } else if (mode == 2) {
                        C64368fm fmVar = this.f327363a.f327361i;
                        byte[] bytes = charSequence.toString().getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        fmVar.f183148d = new C89349b(bytes, 0, bytes.length);
                        bundle.putByteArray("PARAM_1_BYTEARRAY", this.f327363a.f327361i.toByteArray());
                        bundle.putLong("PARAM_1_LONG", this.f327363a.f327361i.f183149e);
                        bundle.putInt("PARAM_EDIT_TEXT_COLOR", i);
                        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", i2);
                        bundle.putString("PARAM_EDIT_TEXT_FONT", str);
                        this.f327364b.mo14585p(C101198e.C101199b.EDIT_UPDATE_CAPTION, bundle);
                    }
                    this.f327363a.f327359g.setShow(false);
                    return;
                }
            }
            this.f327363a.f327359g.setShow(false);
        }

        public void onCancel() {
            this.f327363a.f327359g.setShow(false);
            int mode = this.f327363a.f327359g.getMode();
            if (mode == 0) {
                C101198e.C62622a.m73576a(this.f327364b, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
                C101198e.C62622a.m73576a(this.f327364b, C101198e.C101199b.EDIT_ADD_TEXT_CANCEL, (Bundle) null, 2, (Object) null);
            } else if (mode == 2) {
                C101198e.C62622a.m73576a(this.f327364b, C101198e.C101199b.EDIT_CANCEL_CAPTION, (Bundle) null, 2, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109348i(ViewGroup viewGroup, C101198e eVar, EditorInputView editorInputView) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        C87412m.m108594g(editorInputView, "inputPanel");
        this.f327358f = viewGroup;
        this.f327359g = editorInputView;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f357898cc2);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.editor_add_text)");
        ImageView imageView = (ImageView) findViewById;
        this.f327360h = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(this.f327358f.getContext(), C0966R.raw.icons_filled_text, -1));
        imageView.setOnClickListener(this);
        this.f327359g.setConfirmBtnBg(C0966R.C0969drawable.avc);
        this.f327359g.setOnVisibleChangeCallback(new C109349a(eVar));
        this.f327359g.setTextCallback(new C109350b(this, eVar));
        Point b = C75044y4.m89990b(this.f327358f.getContext());
        float f = (float) b.y;
        float f2 = (float) b.x;
        float f3 = f / f2;
        float f4 = f / 2.18f;
        float f5 = (f2 - f4) / ((float) 2);
        if (f3 <= 1.78f) {
            this.f327359g.mo151430f(f4, f5);
        } else if (f3 >= 2.18f) {
            this.f327359g.getClass();
        } else {
            this.f327359g.mo151430f(f4, f5);
            this.f327359g.getClass();
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!(this.f327359g.getVisibility() == 0)) {
            return false;
        }
        EditorInputView editorInputView = this.f327359g;
        EditorInputView.C106032j jVar = editorInputView.f315583G;
        if (jVar != null) {
            jVar.onCancel();
        }
        EditorInputView.C106033k kVar = editorInputView.f315584H;
        if (kVar != null) {
            kVar.onCancel();
        }
        editorInputView.f315595p.clearFocus();
        editorInputView.f315603x.clearFocus();
        this.f327359g.setShow(false);
        return true;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        EditorInputView editorInputView = this.f327359g;
        editorInputView.f315581E = 0;
        editorInputView.setShow(true);
        EditorInputView editorInputView2 = this.f327359g;
        int[] iArr = EditorInputView.f315575P;
        editorInputView2.mo151431g("", EditorInputView.f315576Q, 0);
        C110992d dVar = C110992d.f332425a;
        C110992d.m151314c(dVar, "KEY_CLICK_TEXT_COUNT_INT", 0, 2, (Object) null);
        dVar.mo162669b(5);
        dVar.mo162670d(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setVisibility(int i) {
        this.f327360h.setVisibility(i);
    }

    /* renamed from: x */
    public final void mo160546x(CharSequence charSequence, int i, int i2, String str) {
        EditorInputView editorInputView = this.f327359g;
        editorInputView.f315581E = 0;
        editorInputView.setShow(true);
        this.f327359g.setTypeFace(str);
        this.f327359g.mo151431g(charSequence, i, i2);
    }

    /* renamed from: y */
    public final void mo160547y(Integer num, Integer num2) {
        View confirm = this.f327359g.getConfirm();
        if (!(num == null || num.intValue() == 0)) {
            confirm.setBackgroundResource(num.intValue());
        }
        if (num2 != null && num2.intValue() != 0 && (confirm instanceof TextView)) {
            TextView textView = (TextView) confirm;
            textView.setTextColor(C111105a.m151500b(textView.getContext(), num2.intValue()));
        }
    }

    /* renamed from: z */
    public final void mo160548z(byte[] bArr, int i, int i2, String str) {
        C87412m.m108594g(bArr, "transResult");
        try {
            C64368fm fmVar = new C64368fm();
            try {
                fmVar.parseFrom(bArr);
            } catch (Exception e) {
                Log.printDebugStack("safeParser", "", e);
                fmVar = null;
            }
            if (fmVar != null) {
                C64368fm fmVar2 = this.f327361i;
                fmVar2.f183152h = fmVar.f183152h;
                fmVar2.f183148d = fmVar.f183148d;
                fmVar2.f183149e = fmVar.f183149e;
                fmVar2.f183150f = fmVar.f183150f;
                EditorInputView editorInputView = this.f327359g;
                editorInputView.f315581E = 2;
                editorInputView.setShow(true);
                this.f327359g.setTypeFace(str);
                this.f327359g.mo151431g(fmVar.f183148d.mo123705h(), i, i2);
            }
        } catch (IOException e2) {
            int i3 = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.EditAddTextPlugin", e2, "", new Object[0]);
        }
    }
}
