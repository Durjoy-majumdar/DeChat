package n21;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import j20.C117292a;
import java.util.ArrayList;
import p21.C100616a;

/* renamed from: n21.g */
public class C100052g extends C100047f {

    /* renamed from: U */
    public View f293097U;

    /* renamed from: n21.g$a */
    public class C100053a implements View.OnClickListener {
        public C100053a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorSplitItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100052g.this.f293081D.mo127558x();
            C100052g.this.f293081D.requestFocus();
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorSplitItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C100052g(View view, C93083b bVar) {
        super(view, bVar);
        this.f293082E.setVisibility(8);
        this.f293079B.setVisibility(8);
        this.f293087J.setVisibility(8);
        this.f293082E.setOnClickListener((View.OnClickListener) null);
        this.f293088K.setOnClickListener(new C100053a());
    }

    /* renamed from: y */
    public int mo139367y() {
        return -1;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        super.mo139368z(aVar, i, i2);
        if (aVar.mo140076b() == -1) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f293089L.getLayoutParams();
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            this.f293089L.setLayoutParams(layoutParams);
            this.f293088K.setVisibility(0);
            this.f293097U = this.f44854d.findViewById(C0966R.C0970id.f358869hj1);
        }
    }
}
