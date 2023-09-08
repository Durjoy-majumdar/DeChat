package gl3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gl3.C75922b;

/* renamed from: gl3.v */
public class C75973v extends C75921a {

    /* renamed from: B */
    public C75974a f222769B = new C75974a();

    /* renamed from: C */
    public C75975b f222770C = new C75975b(this);

    /* renamed from: gl3.v$a */
    public class C75974a implements C75922b.C75924b {
        public C75974a() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75975b bVar2 = (C75975b) aVar;
            bVar2.f222773b.setText(C0966R.string.iit);
            if (z2) {
                bVar2.f222774c.setVisibility(0);
            } else {
                bVar2.f222774c.setVisibility(8);
            }
            bVar2.f222772a.setBackgroundResource(C0966R.C0969drawable.f4859pe);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwk, viewGroup, false);
            C75975b bVar = C75973v.this.f222770C;
            bVar.f222773b = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            bVar.f222772a = inflate.findViewById(C0966R.C0970id.j_7);
            bVar.f222774c = (ImageView) inflate.findViewById(C0966R.C0970id.j_y);
            inflate.setTag(bVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    /* renamed from: gl3.v$b */
    public class C75975b implements C75922b.C75923a {

        /* renamed from: a */
        public View f222772a;

        /* renamed from: b */
        public TextView f222773b;

        /* renamed from: c */
        public ImageView f222774c;

        public C75975b(C75973v vVar) {
        }
    }

    public C75973v(int i) {
        super(7, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222769B;
    }
}
