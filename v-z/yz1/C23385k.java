package yz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePicker;
import com.tencent.p014mm.plugin.groupsolitaire.p885ui.GroupSolitatireEditUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.TPOptionalID;
import java.util.Locale;
import kg3.C76577a;
import yz1.C23387t;
import zn0.C91802b;

/* renamed from: yz1.k */
public class C23385k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public C104428a f67140d;

    /* renamed from: e */
    public View f67141e;

    /* renamed from: f */
    public Context f67142f;

    /* renamed from: g */
    public int f67143g = C76577a.m92151b(this.f67142f, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);

    /* renamed from: h */
    public BottomSheetBehavior f67144h;

    /* renamed from: i */
    public CustomDatePicker f67145i;

    /* renamed from: j */
    public C23386a f67146j;

    /* renamed from: yz1.k$a */
    public interface C23386a<T> {
    }

    public C23385k(Context context) {
        this.f67142f = context;
        View inflate = View.inflate(context, C0966R.C0971layout.ays, (ViewGroup) null);
        this.f67141e = inflate;
        this.f67145i = (CustomDatePicker) inflate.findViewById(C0966R.C0970id.f357831bz3);
        ((Button) this.f67141e.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C23381g(this));
        ((Button) this.f67141e.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C23382h(this));
        C104428a aVar = new C104428a(this.f67142f, 0);
        this.f67140d = aVar;
        aVar.setContentView(this.f67141e);
        this.f67140d.setOnCancelListener(new C23383i(this));
        this.f67140d.setOnDismissListener(new C23384j(this));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f67141e.getLayoutParams();
        layoutParams.height = C76577a.m92151b(this.f67142f, C91802b.CTRL_INDEX);
        this.f67141e.setLayoutParams(layoutParams);
        BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f67141e.getParent());
        this.f67144h = y;
        if (y != null) {
            y.mo146383A(this.f67143g);
            this.f67144h.f309230p = false;
        }
    }

    /* renamed from: a */
    public static void m27905a(C23385k kVar, boolean z, int i, int i2, int i3) {
        C23386a aVar = kVar.f67146j;
        if (aVar != null) {
            C23387t.C23388a aVar2 = (C23387t.C23388a) aVar;
            if (z) {
                Locale locale = Locale.US;
                Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "group solitaire time :%s", String.format(locale, "%04d-%02d-%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
                GroupSolitatireEditUI groupSolitatireEditUI = C23387t.this.f67147d;
                String format = String.format(locale, "%04d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
                int i4 = GroupSolitatireEditUI.f198377U;
                groupSolitatireEditUI.mo95040H7(format);
                C23387t.this.f67147d.mo95042L7(1);
            }
        }
    }

    public void onGlobalLayout() {
    }
}
