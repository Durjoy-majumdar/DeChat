package p518fb;

import android.view.View;
import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import j20.C117292a;
import java.util.ArrayList;
import li0.C88509c;
import p912nb.C88909b;

/* renamed from: fb.m */
public class C86791m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WAGamePanelInputEditText f251917d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f251918e;

    /* renamed from: f */
    public final /* synthetic */ boolean f251919f;

    /* renamed from: g */
    public final /* synthetic */ C88909b f251920g;

    /* renamed from: h */
    public final /* synthetic */ C88509c.C88512b f251921h;

    /* renamed from: i */
    public final /* synthetic */ C86795q f251922i;

    public C86791m(C86795q qVar, WAGamePanelInputEditText wAGamePanelInputEditText, C81925i2 i2Var, boolean z, C88909b bVar, C88509c.C88512b bVar2) {
        this.f251922i = qVar;
        this.f251917d = wAGamePanelInputEditText;
        this.f251918e = i2Var;
        this.f251919f = z;
        this.f251920g = bVar;
        this.f251921h = bVar2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/luggage/game/jsapi/keyboard/WAGameJsApiShowKeyboard$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f251922i.f251934i.mo121216s(this.f251917d.getEditableText().toString(), this.f251918e);
        this.f251922i.f251932g.mo121217s(this.f251917d.getEditableText().toString(), this.f251918e);
        if (!this.f251919f) {
            try {
                this.f251920g.mo117893z();
                this.f251918e.getRuntime().f238113K.mo122982e(this.f251921h);
            } catch (Exception unused) {
            }
        }
        C117292a.m165361g(this, "com/tencent/luggage/game/jsapi/keyboard/WAGameJsApiShowKeyboard$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
