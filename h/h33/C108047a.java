package h33;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view.TextColorSelector;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: h33.a */
public final class C108047a {

    /* renamed from: h */
    public static final int[] f323555h = {-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596};

    /* renamed from: a */
    public final EditorPanelHolder f323556a;

    /* renamed from: b */
    public final C13601g f323557b = C36568h.m40985a(new C108051d(this));

    /* renamed from: c */
    public final C13601g f323558c = C36568h.m40985a(new C108050c(this));

    /* renamed from: d */
    public final C13601g f323559d = C36568h.m40985a(new C108052e(this));

    /* renamed from: e */
    public final C13601g f323560e = C36568h.m40985a(new C108049b(this));

    /* renamed from: f */
    public boolean f323561f;

    /* renamed from: g */
    public C108048a f323562g;

    /* renamed from: h33.a$a */
    public interface C108048a {
        /* renamed from: a */
        void mo158443a();

        /* renamed from: b */
        void mo158444b(int i);

        /* renamed from: c */
        void mo158445c();
    }

    /* renamed from: h33.a$b */
    public static final class C108049b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C108047a f323563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108049b(C108047a aVar) {
            super(0);
            this.f323563d = aVar;
        }

        public Object invoke() {
            return (ImageView) this.f323563d.mo158442b().findViewById(C0966R.C0970id.ccf);
        }
    }

    /* renamed from: h33.a$c */
    public static final class C108050c extends C87413o implements C32224a<TextColorSelector> {

        /* renamed from: d */
        public final /* synthetic */ C108047a f323564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108050c(C108047a aVar) {
            super(0);
            this.f323564d = aVar;
        }

        public Object invoke() {
            return (TextColorSelector) this.f323564d.mo158442b().findViewById(C0966R.C0970id.bio);
        }
    }

    /* renamed from: h33.a$d */
    public static final class C108051d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C108047a f323565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108051d(C108047a aVar) {
            super(0);
            this.f323565d = aVar;
        }

        public Object invoke() {
            View inflate = LayoutInflater.from(this.f323565d.f323556a.getContext()).inflate(C0966R.C0971layout.a0u, this.f323565d.f323556a, false);
            EditorPanelHolder editorPanelHolder = this.f323565d.f323556a;
            C87412m.m108593f(inflate, LocaleUtil.ITALIAN);
            EditorPanelHolder.m142603c(editorPanelHolder, inflate, (ViewGroup.LayoutParams) null, 2, (Object) null);
            return inflate;
        }
    }

    /* renamed from: h33.a$e */
    public static final class C108052e extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C108047a f323566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108052e(C108047a aVar) {
            super(0);
            this.f323566d = aVar;
        }

        public Object invoke() {
            return (ImageView) this.f323566d.mo158442b().findViewById(C0966R.C0970id.if9);
        }
    }

    public C108047a(EditorPanelHolder editorPanelHolder) {
        C87412m.m108594g(editorPanelHolder, "holder");
        this.f323556a = editorPanelHolder;
    }

    /* renamed from: a */
    public final TextColorSelector mo158441a() {
        return (TextColorSelector) ((C36570n) this.f323558c).getValue();
    }

    /* renamed from: b */
    public final View mo158442b() {
        return (View) ((C36570n) this.f323557b).getValue();
    }
}
