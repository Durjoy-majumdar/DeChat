package gl3;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import gl3.C75922b;

/* renamed from: gl3.u */
public class C75970u extends C75921a {

    /* renamed from: B */
    public int f222762B;

    /* renamed from: C */
    public boolean f222763C;

    /* renamed from: D */
    public C75972b f222764D = new C75972b();

    /* renamed from: E */
    public C75922b.C75923a f222765E = new C75971a(this);

    /* renamed from: gl3.u$a */
    public class C75971a implements C75922b.C75923a {

        /* renamed from: a */
        public TextView f222766a;

        /* renamed from: b */
        public ImageView f222767b;

        public C75971a(C75970u uVar) {
        }
    }

    /* renamed from: gl3.u$b */
    public class C75972b implements C75922b.C75924b {
        public C75972b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75971a aVar2 = (C75971a) aVar;
            C75970u uVar = (C75970u) bVar;
            Resources resources = context.getResources();
            if (C75970u.this.f222763C) {
                C93938f0.m118694b(resources.getString(C0966R.string.iho, new Object[]{resources.getString(uVar.f222762B)}), aVar2.f222766a);
                aVar2.f222767b.setRotation(0.0f);
                return;
            }
            C93938f0.m118694b(resources.getString(C0966R.string.ihp), aVar2.f222766a);
            aVar2.f222767b.setRotation(180.0f);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bwj, viewGroup, false);
            C75971a aVar = (C75971a) C75970u.this.f222765E;
            aVar.f222766a = (TextView) inflate.findViewById(C0966R.C0970id.h06);
            aVar.f222767b = (ImageView) inflate.findViewById(C0966R.C0970id.f358770gz3);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75970u(int i) {
        super(1, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222764D;
    }
}
