package com.tencent.p014mm.p136ui.contact;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.x2 */
public class C74589x2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74599y2 f219247d;

    /* renamed from: com.tencent.mm.ui.contact.x2$a */
    public class C74590a implements Runnable {
        public C74590a() {
        }

        public void run() {
            List<String> list = C74589x2.this.f219247d.f219263f;
            if (list == null || list.size() <= 0) {
                Log.m105924i("MicroMsg.OpenIMListHeaderView", "openimIdList is null");
                return;
            }
            C74589x2.this.f219247d.f219263f.remove("wework");
            Log.m105925i("MicroMsg.OpenIMListHeaderView", "openim list size = %s", Integer.valueOf(C74589x2.this.f219247d.f219263f.size()));
            C74599y2 y2Var = C74589x2.this.f219247d;
            if (y2Var.f219262e == null) {
                View.inflate(y2Var.getContext(), C0966R.C0971layout.f359919bm2, C74589x2.this.f219247d);
                C74599y2 y2Var2 = C74589x2.this.f219247d;
                y2Var2.f219262e = (LinearLayout) y2Var2.findViewById(C0966R.C0970id.f357785br0);
            }
            C74589x2.this.f219247d.f219262e.removeAllViews();
            for (int i = 0; i < C74589x2.this.f219247d.f219263f.size(); i++) {
                C6880b3 b3Var = new C6880b3(C74589x2.this.f219247d.getContext(), C74589x2.this.f219247d.f219263f.get(i));
                C74589x2.this.f219247d.f219262e.addView(b3Var);
                if (i == C74589x2.this.f219247d.f219263f.size() - 1) {
                    View findViewById = b3Var.findViewById(C0966R.C0970id.ckb);
                    int paddingLeft = findViewById.getPaddingLeft();
                    findViewById.setBackground(C74942w4.m89785b(C74589x2.this.f219247d.f219261d, C0966R.attr.f2868u6));
                    findViewById.findViewById(C0966R.C0970id.ckd).setBackground((Drawable) null);
                    findViewById.setPadding(paddingLeft, 0, 0, 0);
                } else {
                    b3Var.findViewById(C0966R.C0970id.ckb).setBackground((Drawable) null);
                    b3Var.findViewById(C0966R.C0970id.ckb).findViewById(C0966R.C0970id.ckd).setBackground(C74942w4.m89785b(C74589x2.this.f219247d.f219261d, C0966R.attr.f2868u6));
                }
            }
            C74599y2 y2Var3 = C74589x2.this.f219247d;
            y2Var3.f219264g.mo103608a(y2Var3.f219263f.size());
        }
    }

    public C74589x2(C74599y2 y2Var) {
        this.f219247d = y2Var;
    }

    public void run() {
        this.f219247d.f219263f = C97625j3.m125812b().mo105907v().mo69722q4();
        this.f219247d.post(new C74590a());
    }
}
