package sj3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import di3.C86312j;
import gc0.C20828a;
import gl3.C75921a;
import gl3.C75922b;
import hc0.C20937c;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import p248ug.C52556a;
import p629ny.C76979h;

/* renamed from: sj3.a */
public class C77716a extends C75921a {

    /* renamed from: F */
    public static Map<String, C20937c> f226504F = new HashMap();

    /* renamed from: B */
    public String f226505B;

    /* renamed from: C */
    public long f226506C = -1;

    /* renamed from: D */
    public C77718b f226507D = new C77718b();

    /* renamed from: E */
    public C77717a f226508E = new C77717a(this);

    /* renamed from: sj3.a$a */
    public class C77717a implements C75922b.C75923a {

        /* renamed from: a */
        public ImageView f226509a;

        /* renamed from: b */
        public TextView f226510b;

        public C77717a(C77716a aVar) {
        }
    }

    /* renamed from: sj3.a$b */
    public class C77718b implements C75922b.C75924b {
        public C77718b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C20937c cVar;
            C77716a aVar2 = (C77716a) bVar;
            C77717a aVar3 = (C77717a) aVar;
            C93938f0.m118693a(aVar2.f222601x, aVar3.f226510b);
            C20828a b = C20828a.m22825b();
            String str = aVar2.f226505B;
            ImageView imageView = aVar3.f226509a;
            C77716a aVar4 = C77716a.this;
            String str2 = aVar2.f222602y;
            aVar4.getClass();
            if (str2 == null) {
                cVar = null;
            } else if (!((HashMap) C77716a.f226504F).containsKey(str2) || ((HashMap) C77716a.f226504F).get(str2) == null) {
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59351g = C52556a.m58840a(str2);
                bVar2.f59346b = true;
                bVar2.f59363s = true;
                bVar2.f59359o = C0966R.raw.default_avatar;
                C20937c a = bVar2.mo32666a();
                ((HashMap) C77716a.f226504F).put(str2, a);
                cVar = a;
            } else {
                cVar = (C20937c) ((HashMap) C77716a.f226504F).get(str2);
            }
            b.mo32519h(str, imageView, cVar);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = C76577a.m92147C(context) ? LayoutInflater.from(context).inflate(C0966R.C0971layout.bwf, viewGroup, false) : LayoutInflater.from(context).inflate(C0966R.C0971layout.bwe, viewGroup, false);
            C77717a aVar = C77716a.this.f226508E;
            aVar.f226509a = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f226510b = (TextView) inflate.findViewById(C0966R.C0970id.kpm);
            ((TextView) inflate.findViewById(C0966R.C0970id.c2h)).setVisibility(8);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C77716a(int i) {
        super(4, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        this.f222601x = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, this.f222601x, C76577a.m92157h(context, C0966R.dimen.f3927j7));
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f226507D;
    }
}
