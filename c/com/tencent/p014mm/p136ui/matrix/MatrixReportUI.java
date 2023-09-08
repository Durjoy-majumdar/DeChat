package com.tencent.p014mm.p136ui.matrix;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.matrix.C80981c;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.matrix.recyclerview.JsonRecyclerView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jm3.C21264b;
import org.json.JSONArray;
import p910lj.C76701a;
import r70.C89888c;

/* renamed from: com.tencent.mm.ui.matrix.MatrixReportUI */
public class MatrixReportUI extends MMActivity {

    /* renamed from: d */
    public JSONArray f24714d = new JSONArray();

    /* renamed from: com.tencent.mm.ui.matrix.MatrixReportUI$a */
    public class C6984a implements MenuItem.OnMenuItemClickListener {
        public C6984a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MatrixReportUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.matrix.MatrixReportUI$b */
    public class C6985b implements View.OnLongClickListener {
        public C6985b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/matrix/MatrixReportUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view.getTag() != null) {
                ClipboardHelper.setText(view.getTag().toString());
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MatrixReportUI.this.getContext().getResources().getString(C0966R.string.f7938wv), 0).show();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/matrix/MatrixReportUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bbb;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(getContext().getResources().getString(C0966R.string.gpx));
        setBackBtn(new C6984a());
        Iterator<C89888c.C89889a> it = C80981c.INSTANCE.f237852d.f258344j.iterator();
        while (it.hasNext()) {
            this.f24714d.put(it.next().f261446d);
        }
        C21264b bVar = new C21264b(this.f24714d);
        ((JsonRecyclerView) findViewById(C0966R.C0970id.fei)).setAdapter(bVar);
        bVar.f60068o = new C6985b();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
