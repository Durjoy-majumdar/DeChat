package n21;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import p21.C100616a;
import p21.C100629n;

/* renamed from: n21.i */
public class C100059i extends C100047f {
    public C100059i(View view, C93083b bVar) {
        super(view, bVar);
        this.f293082E.setVisibility(0);
        this.f293079B.setVisibility(8);
        this.f293087J.setVisibility(8);
        this.f293082E.setTag(this);
        this.f293082E.setOnClickListener(this.f293093Q);
    }

    /* renamed from: y */
    public int mo139367y() {
        return 0;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        this.f293085H.setImageResource(C0966R.raw.msg_state_fail_resend);
        TextView textView = this.f293083F;
        C100629n nVar = (C100629n) aVar;
        nVar.getClass();
        textView.setText((CharSequence) null);
        TextView textView2 = this.f293084G;
        nVar.getClass();
        textView2.setText((CharSequence) null);
        super.mo139368z(aVar, i, i2);
    }
}
