package p518fb;

import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.plugin.appbrand.C81925i2;

/* renamed from: fb.g */
public class C86785g implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ WAGamePanelInputEditText f251890d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f251891e;

    /* renamed from: f */
    public final /* synthetic */ boolean f251892f;

    /* renamed from: g */
    public final /* synthetic */ C86795q f251893g;

    public C86785g(C86795q qVar, WAGamePanelInputEditText wAGamePanelInputEditText, C81925i2 i2Var, boolean z) {
        this.f251893g = qVar;
        this.f251890d = wAGamePanelInputEditText;
        this.f251891e = i2Var;
        this.f251892f = z;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f251893g.f251934i.mo121216s(this.f251890d.getEditableText().toString(), this.f251891e);
        return this.f251892f;
    }
}
