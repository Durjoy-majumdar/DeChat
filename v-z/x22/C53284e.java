package x22;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import y22.C118913e;

/* renamed from: x22.e */
public class C53284e implements C102550b {

    /* renamed from: d */
    public View f148877d;

    /* renamed from: e */
    public String f148878e;

    /* renamed from: f */
    public TextView f148879f;

    /* renamed from: g */
    public TextView f148880g;

    /* renamed from: h */
    public ImageButton f148881h;

    /* renamed from: i */
    public ViewGroup f148882i;

    public C53284e(C118913e eVar, Context context) {
        View findViewById = ((Activity) context).findViewById(C0966R.C0970id.g4_);
        this.f148879f = (TextView) findViewById.findViewById(C0966R.C0970id.g48);
        this.f148880g = (TextView) findViewById.findViewById(C0966R.C0970id.g49);
        this.f148881h = (ImageButton) findViewById.findViewById(C0966R.C0970id.g4h);
        this.f148882i = (ViewGroup) findViewById.findViewById(C0966R.C0970id.o9b);
        this.f148877d = findViewById;
    }

    public String getPreText() {
        return "";
    }

    public void setText(String str) {
        Log.m105918d("NewItemOverlay", "popView " + this.f148877d.getWidth() + " " + this.f148877d.getHeight());
        if (str != null && !str.equals("")) {
            this.f148880g.setText(str);
        }
        String str2 = this.f148878e;
        if (str2 == null || str2.equals("")) {
            this.f148879f.setText(C0966R.string.gaw);
        } else {
            this.f148879f.setText(this.f148878e);
        }
        View view = this.f148877d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/NewItemOverlay", "initInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/NewItemOverlay", "initInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f148877d.invalidate();
    }
}
