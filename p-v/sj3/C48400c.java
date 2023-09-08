package sj3;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import p248ug.C52556a;
import p629ny.C76979h;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48335d;
import sb0.C48340e;

/* renamed from: sj3.c */
public class C48400c extends C6975i1<C48334c> {

    /* renamed from: o */
    public final MMActivity f129572o;

    /* renamed from: p */
    public final String f129573p;

    /* renamed from: q */
    public MMSlideDelView.C73186f f129574q = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: r */
    public C20937c f129575r = null;

    /* renamed from: sj3.c$a */
    public static class C48401a {

        /* renamed from: a */
        public ImageView f129576a;

        /* renamed from: b */
        public TextView f129577b;
    }

    public C48400c(Context context, C6975i1.C6977b bVar, String str) {
        super(context, new C48334c());
        this.f24699h = bVar;
        this.f129572o = (MMActivity) context;
        this.f129573p = str;
        C20937c.C20939b bVar2 = new C20937c.C20939b();
        String str2 = C48340e.f129426a;
        bVar2.f59351g = C52556a.m58840a(str);
        bVar2.f59346b = true;
        bVar2.f59363s = true;
        bVar2.f59359o = C0966R.raw.default_avatar;
        this.f129575r = bVar2.mo32666a();
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C48334c cVar = (C48334c) obj;
        if (cVar == null) {
            cVar = new C48334c();
        }
        cVar.convertFrom(cursor);
        return cVar;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        C48401a aVar;
        C48334c cVar = (C48334c) getItem(i);
        if (view == null) {
            aVar = new C48401a();
            view2 = View.inflate(this.f129572o, C0966R.C0971layout.a3q, (ViewGroup) null);
            aVar.f129576a = (ImageView) view2.findViewById(C0966R.C0970id.a27);
            aVar.f129577b = (TextView) view2.findViewById(C0966R.C0970id.h_d);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C48401a) view.getTag();
        }
        C20828a.m22825b().mo32519h(cVar.field_headImageUrl, aVar.f129576a, this.f129575r);
        aVar.f129577b.setText(((C76979h) C86312j.m106911c(C76979h.class)).op0(this.f129572o, cVar.field_chatName, (int) aVar.f129577b.getTextSize()));
        return view2;
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        mo5580b();
        C48335d Ax0 = C48009v0.Ax0();
        String str = this.f129573p;
        Ax0.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ");
        sb.append("BizChatInfo");
        sb.append(" where ");
        sb.append("brandUserName");
        sb.append(" = '");
        sb.append(str);
        sb.append("'");
        sb.append(" and (");
        sb.append("bitFlag");
        sb.append(" & ");
        sb.append(8);
        sb.append(") != 0 ");
        sb.append(" order by ");
        sb.append(" case when length(BizChatInfo.chatNamePY) > 0 then upper(BizChatInfo.chatNamePY)  else upper(BizChatInfo.chatName) end asc,  upper(BizChatInfo.chatNamePY) asc,  upper(BizChatInfo.chatName) asc ");
        Log.m105919d("MicroMsg.BizChatInfoStorage", "getBizChatFavCursor: sql:%s", sb.toString());
        mo7998r(Ax0.f129417d.rawQuery(sb.toString(), (String[]) null));
        C6975i1.C6977b bVar = this.f24699h;
        if (bVar != null) {
            bVar.mo1327a((Object) null);
        }
        notifyDataSetChanged();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        super.onNotifyChange(i, mStorageEx, obj);
    }
}
