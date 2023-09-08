package ax2;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.subapp.p109ui.pluginapp.AddMoreFriendsUI;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: ax2.d */
public class C0229d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddMoreFriendsUI f763d;

    /* renamed from: ax2.d$a */
    public class C0230a implements Runnable {
        public C0230a() {
        }

        public void run() {
            C0229d.this.f763d.f21334f.show();
            WindowManager.LayoutParams attributes = C0229d.this.f763d.f21334f.getWindow().getAttributes();
            attributes.width = C0229d.this.f763d.getWindow().getDecorView().getWidth();
            C0229d.this.f763d.f21334f.getWindow().setAttributes(attributes);
        }
    }

    public C0229d(AddMoreFriendsUI addMoreFriendsUI) {
        this.f763d = addMoreFriendsUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        AddMoreFriendsUI addMoreFriendsUI = this.f763d;
        if (addMoreFriendsUI.f21333e) {
            addMoreFriendsUI.setRequestedOrientation(1);
            C119179t tVar = C119157j.f356862d;
            C0230a aVar = new C0230a();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 100, false);
        } else {
            C115669n.INSTANCE.mo160131h(11264, 1);
            Intent intent = new Intent();
            intent.setClassName(this.f763d, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI");
            AppCompatActivity context = this.f763d.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/pluginapp/AddMoreFriendsUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
