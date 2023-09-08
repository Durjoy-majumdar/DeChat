package v82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import gl3.C75922b;
import gl3.C75939h;
import p196ln.C76705f;
import p255vr.C78470h;

/* renamed from: v82.a0 */
public class C78362a0 extends C75939h {

    /* renamed from: K */
    public C78363a f229634K = new C78363a();

    /* renamed from: v82.a0$a */
    public class C78363a extends C75939h.C75941b {
        public C78363a() {
            super(C78362a0.this);
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75939h.C75940a aVar2 = (C75939h.C75940a) aVar;
            C75939h hVar = (C75939h) bVar;
            String str = hVar.f222602y;
            if (str == null || str.length() <= 0) {
                aVar2.f222686b.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(aVar2.f222686b, hVar.f222602y);
            }
            ((C78470h) C86312j.m106911c(C78470h.class)).mo108300VH(hVar.f222601x, aVar2.f222687c);
            if (C78362a0.this.f222608e) {
                if (z) {
                    aVar2.f222689e.setChecked(true);
                    aVar2.f222689e.setEnabled(false);
                    aVar2.f222689e.setBackgroundResource(C0966R.raw.checkbox_selected_grey_dark);
                } else {
                    aVar2.f222689e.setChecked(z2);
                    aVar2.f222689e.setEnabled(true);
                    if (z2) {
                        aVar2.f222689e.setBackgroundResource(C0966R.raw.checkbox_selected);
                    } else {
                        aVar2.f222689e.setBackgroundResource(C0966R.C0969drawable.f4826o1);
                    }
                }
                aVar2.f222689e.setVisibility(0);
                return;
            }
            aVar2.f222689e.setVisibility(8);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bhi, viewGroup, false);
            C75939h.C75940a aVar = C78362a0.this.f222684J;
            aVar.f222686b = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f222687c = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            aVar.f222688d = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            aVar.f222685a = inflate.findViewById(C0966R.C0970id.j_7);
            aVar.f222689e = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
            inflate.setTag(aVar);
            return inflate;
        }
    }

    public C78362a0(int i) {
        super(i);
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f229634K;
    }
}
