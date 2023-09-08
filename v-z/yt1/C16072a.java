package yt1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yt1.a */
public class C16072a extends C103422m {

    /* renamed from: yt1.a$a */
    public class C16073a implements View.OnClickListener {
        public C16073a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/flash/guide/FaceFlashResetTipDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C16072a.this.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/flash/guide/FaceFlashResetTipDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C16072a(Context context) {
        super(context, C0966R.style.f8426i2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0966R.C0971layout.a5p);
        getWindow().setLayout(-1, -2);
        getWindow().setGravity(80);
        findViewById(C0966R.C0970id.cq7).setOnClickListener(new C16073a());
    }
}
