package k11;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import fy3.C32224a;
import gy3.C87413o;
import h11.C98311d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: k11.c */
public final class C108813c extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C108809b f325838d;

    /* renamed from: e */
    public final /* synthetic */ TextView f325839e;

    /* renamed from: f */
    public final /* synthetic */ CleanCacheUI f325840f;

    /* renamed from: g */
    public final /* synthetic */ Button f325841g;

    /* renamed from: h */
    public final /* synthetic */ Button f325842h;

    /* renamed from: i */
    public final /* synthetic */ View f325843i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108813c(C108809b bVar, TextView textView, CleanCacheUI cleanCacheUI, Button button, Button button2, View view) {
        super(0);
        this.f325838d = bVar;
        this.f325839e = textView;
        this.f325840f = cleanCacheUI;
        this.f325841g = button;
        this.f325842h = button2;
        this.f325843i = view;
    }

    public Object invoke() {
        boolean z;
        long f = this.f325838d.mo159908f();
        boolean z2 = true;
        this.f325839e.setText(this.f325840f.getString(C0966R.string.byb, new Object[]{C98311d.m127053b(f)}));
        boolean[] zArr = this.f325838d.f325822f;
        int length = zArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            } else if (!zArr[i]) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        this.f325841g.setTag(Boolean.valueOf(z));
        this.f325841g.setText(z ? C0966R.string.auk : C0966R.string.f7555ji);
        int i2 = (f > 0 ? 1 : (f == 0 ? 0 : -1));
        this.f325842h.setEnabled(i2 > 0);
        int i3 = 8;
        this.f325839e.setVisibility(i2 > 0 ? 0 : 8);
        View view = this.f325843i;
        if (this.f325838d.getGroupCount() <= 0) {
            i3 = 0;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i3));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$1", "invoke", "()Ljava/lang/Boolean;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$1", "invoke", "()Ljava/lang/Boolean;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Button button = this.f325841g;
        if (this.f325838d.getGroupCount() <= 0) {
            z2 = false;
        }
        button.setEnabled(z2);
        return Boolean.TRUE;
    }
}
