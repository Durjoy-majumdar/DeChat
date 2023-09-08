package ib3;

import android.view.View;
import android.widget.RelativeLayout;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import j20.C117292a;
import java.util.ArrayList;
import xa3.C102587c;

/* renamed from: ib3.p */
public class C98649p extends C98648o {

    /* renamed from: V */
    public View f289254V;

    /* renamed from: ib3.p$a */
    public class C98650a implements View.OnClickListener {
        public C98650a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteSplitItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C98649p.this.f289236D.mo134893x();
            C98649p.this.f289236D.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteSplitItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C98649p(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        this.f289237E.setVisibility(8);
        this.f289234B.setVisibility(8);
        this.f289242J.setVisibility(8);
        this.f289237E.setOnClickListener((View.OnClickListener) null);
        this.f289243K.setOnClickListener(new C98650a());
    }

    /* renamed from: y */
    public int mo138058y() {
        return -1;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        super.mo138059z(cVar, i, i2);
        if (cVar.mo142212c() == -1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f289244L.getLayoutParams();
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            this.f289244L.setLayoutParams(layoutParams);
            this.f289243K.setVisibility(0);
            this.f289254V = this.f44854d.findViewById(C0966R.C0970id.f358869hj1);
        }
    }
}
