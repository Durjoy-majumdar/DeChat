package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gl3.C75921a;
import gl3.C75922b;
import java.util.regex.Pattern;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;
import qe0.C47806g;

/* renamed from: com.tencent.mm.plugin.aa.ui.z */
public class C68354z extends C75921a {

    /* renamed from: B */
    public C68356b f196387B = new C68356b();

    /* renamed from: C */
    public C68355a f196388C = new C68355a(this);

    /* renamed from: com.tencent.mm.plugin.aa.ui.z$a */
    public class C68355a implements C75922b.C75923a {

        /* renamed from: a */
        public View f196389a;

        /* renamed from: b */
        public View f196390b;

        /* renamed from: c */
        public ImageView f196391c;

        /* renamed from: d */
        public TextView f196392d;

        /* renamed from: e */
        public TextView f196393e;

        /* renamed from: f */
        public TextView f196394f;

        /* renamed from: g */
        public CheckBox f196395g;

        public C68355a(C68354z zVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.z$b */
    public class C68356b implements C75922b.C75924b {

        /* renamed from: com.tencent.mm.plugin.aa.ui.z$b$a */
        public class C68357a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C68355a f196397d;

            /* renamed from: e */
            public final /* synthetic */ Context f196398e;

            public C68357a(C68356b bVar, C68355a aVar, Context context) {
                this.f196397d = aVar;
                this.f196398e = context;
            }

            public void run() {
                int top = (this.f196397d.f196394f.getTop() - this.f196397d.f196392d.getBottom()) - C76577a.m92151b(this.f196398e, 4);
                if (top < 0) {
                    top = 0;
                }
                if (this.f196397d.f196394f.getTop() - this.f196397d.f196392d.getBottom() != C76577a.m92151b(this.f196398e, 4)) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f196397d.f196394f.getLayoutParams();
                    layoutParams.topMargin = -top;
                    this.f196397d.f196394f.setLayoutParams(layoutParams);
                }
            }
        }

        public C68356b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C68355a aVar2 = (C68355a) aVar;
            C68354z zVar = (C68354z) bVar;
            String str = zVar.f222602y;
            if (str == null || str.length() <= 0) {
                aVar2.f196391c.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar2.f196391c, zVar.f222602y, 0.1f);
            }
            if (!Util.isNullOrNil(zVar.f222601x)) {
                aVar2.f196392d.setText(zVar.f222601x);
                aVar2.f196392d.setVisibility(0);
                aVar2.f196392d.setSingleLine(false);
            } else {
                aVar2.f196392d.setVisibility(8);
            }
            C68354z zVar2 = C68354z.this;
            if (zVar2.f222608e) {
                if (z) {
                    aVar2.f196395g.setChecked(true);
                    aVar2.f196395g.setEnabled(false);
                    aVar2.f196395g.setBackgroundResource(C85875k4.m106211z() ? C0966R.raw.checkbox_selected_grey_dark : C0966R.raw.checkbox_selected_grey);
                } else if (C68354z.m80715k(zVar2, zVar)) {
                    aVar2.f196395g.setChecked(false);
                    aVar2.f196395g.setEnabled(false);
                } else {
                    aVar2.f196395g.setChecked(z2);
                    aVar2.f196395g.setEnabled(true);
                }
                aVar2.f196395g.setVisibility(0);
            } else {
                aVar2.f196395g.setVisibility(8);
            }
            if (C68354z.this.f222612i) {
                aVar2.f196389a.setBackgroundResource(C0966R.C0969drawable.f4859pe);
            } else {
                aVar2.f196389a.setBackgroundResource(C0966R.C0969drawable.f4341s);
            }
            aVar2.f196394f.post(new C68357a(this, aVar2, context));
            String str2 = C68354z.this.f222609f;
            if (zVar.f222600A.mo73975s2() == 1) {
                aVar2.f196394f.setVisibility(0);
                aVar2.f196394f.setText(context.getString(C0966R.string.f7270b3));
            } else if (!Util.isNullOrNil(str2)) {
                aVar2.f196394f.setVisibility(0);
                aVar2.f196394f.setText(str2);
            } else {
                aVar2.f196394f.setVisibility(8);
            }
            if (C68354z.m80715k(C68354z.this, zVar)) {
                aVar2.f196392d.setAlpha(0.3f);
                aVar2.f196394f.setAlpha(0.3f);
                aVar2.f196391c.setAlpha(0.3f);
                String a = C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(zVar.f222602y));
                aVar2.f196393e.setVisibility(0);
                aVar2.f196393e.setText(a);
                aVar2.f196393e.setTextSize(12.0f);
                aVar2.f196393e.setTextColor(context.getResources().getColor(C0966R.color.a7u));
                aVar2.f196393e.setAlpha(0.3f);
                Log.m105925i("MicroMsg.ContactDataItem", "data.username：%s,subName:%s", zVar.f222602y, a);
                return;
            }
            aVar2.f196392d.setAlpha(1.0f);
            aVar2.f196394f.setAlpha(1.0f);
            aVar2.f196391c.setAlpha(1.0f);
            aVar2.f196393e.setVisibility(4);
            Log.m105925i("MicroMsg.ContactDataItem", "data.username：%s", zVar.f222602y);
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d0t, viewGroup, false);
            C68355a aVar = C68354z.this.f196388C;
            aVar.f196389a = inflate.findViewById(C0966R.C0970id.npk);
            aVar.f196390b = inflate.findViewById(C0966R.C0970id.j_7);
            aVar.f196395g = (CheckBox) inflate.findViewById(C0966R.C0970id.j9g);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.a27);
            aVar.f196391c = imageView;
            imageView.setImportantForAccessibility(2);
            aVar.f196392d = (TextView) inflate.findViewById(C0966R.C0970id.l2q);
            aVar.f196393e = (TextView) inflate.findViewById(C0966R.C0970id.nqd);
            aVar.f196394f = (TextView) inflate.findViewById(C0966R.C0970id.c2h);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    static {
        Pattern.compile(",");
    }

    public C68354z(int i) {
        super(2, i);
    }

    /* renamed from: k */
    public static boolean m80715k(C68354z zVar, C68354z zVar2) {
        zVar.getClass();
        return C72996z1.m85843n5(zVar2.f222602y) || (Boolean.valueOf(zVar2.f222617n).booleanValue() && C75592q0.m90789s().equals(zVar2.f222602y)) || !Boolean.valueOf(zVar2.f222618o).booleanValue();
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
        Class cls = C75339i.class;
        C72996z1 z1Var = this.f222600A;
        if (z1Var == null) {
            Log.m105925i("MicroMsg.ContactDataItem", "filling dataItem Occur Error Contact is null, position=%d", Integer.valueOf(this.f222605b));
            return;
        }
        this.f222602y = z1Var.getUsername();
        String pi = Util.isNullOrNil(this.f222620q) ? ((C75339i) C86312j.m106911c(cls)).mo62520pi(this.f222600A) : ((C75339i) C86312j.m106911c(cls)).mo62519pb(this.f222600A.getUsername(), this.f222620q);
        if (C75592q0.m90789s().equals(this.f222602y)) {
            pi = pi + context.getString(C0966R.string.f7306c9);
        }
        this.f222601x = ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, pi, C76577a.m92157h(context, C0966R.dimen.f3927j7));
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f196387B;
    }
}
