package gl3;

import a11.C39479c;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import gl3.C75922b;
import gl3.C75946n;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: gl3.g */
public class C75937g extends C75946n {

    /* renamed from: F */
    public CharSequence f222671F;

    /* renamed from: G */
    public boolean f222672G;

    /* renamed from: H */
    public C72996z1 f222673H;

    /* renamed from: I */
    public C75938a f222674I = new C75938a();

    /* renamed from: gl3.g$a */
    public class C75938a extends C75946n.C75948b {
        public C75938a() {
            super();
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            super.mo67029a(context, aVar, bVar, z, z2);
            C75946n.C75947a aVar2 = (C75946n.C75947a) aVar;
            if (!Util.isNullOrNil(C75937g.this.f222671F)) {
                aVar2.f222708c.setVisibility(0);
                C75937g.this.f222671F = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, C75937g.this.f222671F, C76577a.m92157h(context, C0966R.dimen.f3927j7));
                TextView textView = aVar2.f222708c;
                Resources resources = textView.getContext().getResources();
                C75937g gVar = C75937g.this;
                textView.setText(resources.getString(gVar.f222672G ? C0966R.string.bll : C0966R.string.blk, new Object[]{gVar.f222671F}));
                return;
            }
            aVar2.f222708c.setVisibility(8);
        }
    }

    public C75937g(int i, C72996z1 z1Var) {
        super(i);
        this.f222673H = z1Var;
        this.f222672G = z1Var.f149500H != 1 ? false : true;
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        super.mo67027a(context, aVar);
        boolean z = true;
        if (this.f222673H.f149500H != 1) {
            z = false;
        }
        this.f222672G = z;
        this.f222671F = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(this.f222600A.getUsername()).mo69789q2(this.f222673H.getUsername());
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f222674I;
    }
}
