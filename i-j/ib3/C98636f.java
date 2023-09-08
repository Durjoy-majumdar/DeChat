package ib3;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import xa3.C102587c;
import xa3.C102589e;

/* renamed from: ib3.f */
public class C98636f extends C98628a {

    /* renamed from: B */
    public TextView f289203B;

    /* renamed from: C */
    public View f289204C;

    /* renamed from: D */
    public LinearLayout f289205D;

    public C98636f(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.hin);
        this.f289205D = linearLayout;
        linearLayout.setVisibility(0);
        this.f289203B = (TextView) view.findViewById(C0966R.C0970id.hip);
        this.f289204C = view.findViewById(C0966R.C0970id.hio);
    }

    /* renamed from: y */
    public int mo138058y() {
        return -3;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        if (cVar.mo142212c() == -3) {
            if (this.f289192z.f283197m == 3) {
                this.f289205D.setVisibility(8);
                return;
            }
            this.f289205D.setVisibility(0);
            C102589e eVar = (C102589e) cVar;
            if (eVar.f302083s > 0) {
                Context context = this.f289203B.getContext();
                long j = eVar.f302083s;
                String format = j < 3600000 ? "" : DateFormat.format(context.getString(C0966R.string.cp7), j);
                String string = this.f289203B.getContext().getString(C0966R.string.h_g);
                this.f289203B.setText(string + " " + format);
            }
        }
    }
}
