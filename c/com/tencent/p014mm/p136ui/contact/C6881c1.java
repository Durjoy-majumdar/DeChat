package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.GroupCardSelectUI;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import java.util.List;
import kg3.C76577a;
import p196ln.C76705f;
import p629ny.C76979h;
import p740wo.C53193b;

/* renamed from: com.tencent.mm.ui.contact.c1 */
public class C6881c1 extends BaseAdapter {

    /* renamed from: d */
    public Context f24516d;

    /* renamed from: e */
    public List<C72996z1> f24517e;

    /* renamed from: f */
    public List<String> f24518f;

    /* renamed from: g */
    public boolean f24519g;

    public C6881c1(Context context, List<C72996z1> list, List<String> list2, boolean z) {
        this.f24517e = list;
        this.f24516d = context;
        this.f24519g = z;
        this.f24518f = list2;
    }

    /* renamed from: a */
    public int mo7885a() {
        return C0966R.C0971layout.ayn;
    }

    /* renamed from: b */
    public int mo7886b(C72996z1 z1Var) {
        return ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(z1Var.getUsername());
    }

    public int getCount() {
        return this.f24517e.size();
    }

    public Object getItem(int i) {
        return this.f24517e.get(i);
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        GroupCardSelectUI.C6829c cVar;
        View view2;
        C72996z1 z1Var = this.f24517e.get(i);
        if (view == null) {
            cVar = new GroupCardSelectUI.C6829c();
            view2 = View.inflate(this.f24516d, mo7885a(), (ViewGroup) null);
            cVar.f24411b = (TextView) view2.findViewById(C0966R.C0970id.f358375er2);
            cVar.f24410a = (TextView) view2.findViewById(C0966R.C0970id.f358376er3);
            cVar.f24412c = (ImageView) view2.findViewById(C0966R.C0970id.f358374er1);
            cVar.f24413d = (CheckBox) view2.findViewById(C0966R.C0970id.j9g);
            cVar.f24414e = (WeImageView) view2.findViewById(C0966R.C0970id.nnf);
            view2.setTag(cVar);
        } else {
            view2 = view;
            cVar = (GroupCardSelectUI.C6829c) view.getTag();
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(cVar.f24412c, z1Var.getUsername());
        cVar.f24410a.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f24516d, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(z1Var.getUsername()), C76577a.m92157h(this.f24516d, C0966R.dimen.f3927j7)));
        TextView textView = cVar.f24411b;
        textView.setText("(" + mo7886b(z1Var) + ")");
        if (C45628s0.m50748M(z1Var.getUsername())) {
            Drawable drawable = this.f24516d.getResources().getDrawable(C0966R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            cVar.f24410a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            cVar.f24410a.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (this.f24519g) {
            cVar.f24413d.setVisibility(0);
            if (this.f24518f.contains(z1Var.getUsername())) {
                cVar.f24413d.setChecked(true);
            } else {
                cVar.f24413d.setChecked(false);
            }
        }
        return view2;
    }
}
