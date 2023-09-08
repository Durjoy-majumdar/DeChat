package gl3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gl3.C75922b;
import gl3.C75946n;
import kg3.C76577a;

/* renamed from: gl3.q */
public class C75955q extends C75921a {

    /* renamed from: gl3.q$a */
    public class C75956a implements C75922b.C75924b {
        public C75956a() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75946n.C75947a aVar2 = (C75946n.C75947a) aVar;
            aVar2.f222707b.setText("");
            aVar2.f222709d.setVisibility(8);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false);
            C75955q.this.getClass();
            C75946n.C75947a aVar = new C75946n.C75947a(new C75946n(0));
            aVar.f222706a = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f222707b = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f222708c = textView;
            textView.setVisibility(8);
            aVar.f222709d = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
            inflate.setEnabled(false);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75955q(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return new C75956a();
    }
}
