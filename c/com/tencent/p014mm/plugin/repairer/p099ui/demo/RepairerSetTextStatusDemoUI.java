package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import p158gt.C76057w;
import p773yy.C66708h;
import qy2.C77459z;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI */
public final class RepairerSetTextStatusDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI$a */
    public static final class C70991a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSetTextStatusDemoUI f205459d;

        public C70991a(RepairerSetTextStatusDemoUI repairerSetTextStatusDemoUI) {
            this.f205459d = repairerSetTextStatusDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f205459d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI$b */
    public static final class C70992b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f205460d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI$b$a */
        public static final class C70993a implements C76057w.C76058a {

            /* renamed from: a */
            public static final C70993a f205461a = new C70993a();

            /* renamed from: a */
            public final void mo25933a(String str, Bitmap bitmap, String str2) {
                Log.m105924i("MicroMsg.UrlImageCacheService", "trydownload imgback end:" + str + " bitmap:" + bitmap + " exist:" + C86013q1.m106450k(str2) + " len:" + C86013q1.m106451l(str2));
                if (bitmap != null) {
                    C86013q1.m106450k(str2);
                }
            }
        }

        public C70992b(EditText editText) {
            this.f205460d = editText;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Editable text = this.f205460d.getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            C70993a aVar = C70993a.f205461a;
            Log.m105924i("MicroMsg.UrlImageCacheService", "trydownload imgback start:" + str);
            ((C76057w) C86312j.m106911c(C76057w.class)).h60(str, aVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerSetTextStatusDemoUI$c */
    public static final class C70994c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerSetTextStatusDemoUI f205462d;

        /* renamed from: e */
        public final /* synthetic */ String f205463e;

        public C70994c(RepairerSetTextStatusDemoUI repairerSetTextStatusDemoUI, String str) {
            this.f205462d = repairerSetTextStatusDemoUI;
            this.f205463e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppCompatActivity context = this.f205462d.getContext();
            C77459z zVar = new C77459z();
            zVar.f229400e = this.f205463e;
            zVar.f229399d.f147237f = 2;
            C13598b0 b0Var = C13598b0.f38549a;
            ((C66708h) C86312j.m106911c(C66708h.class)).mo90743iL(context, 3, zVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerSetTextStatusDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bst;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("第三方设置状态Demo");
        setBackBtn(new C70991a(this));
        findViewById(C0966R.C0970id.alp).setOnClickListener(new C70992b((EditText) findViewById(C0966R.C0970id.cdc)));
        findViewById(C0966R.C0970id.amf).setOnClickListener(new C70994c(this, "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/2c691549c7f50ee66ebd332e8f270d6b/video/vsg_output_1622096801814"));
    }
}
