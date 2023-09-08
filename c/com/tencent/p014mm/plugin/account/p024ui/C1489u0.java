package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.account.p024ui.MMFBFriendUI;
import com.tencent.p014mm.storage.C44668u3;
import dg0.C75398e;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import hg0.C76174o;
import hg0.C76175p;
import kg3.C76577a;
import p196ln.C76708i;
import p629ny.C76979h;
import zh3.C91753f;

@Deprecated
/* renamed from: com.tencent.mm.plugin.account.ui.u0 */
public class C1489u0 extends C6975i1<C76174o> {

    /* renamed from: o */
    public int[] f10836o;

    /* renamed from: p */
    public String f10837p;

    /* renamed from: q */
    public C1490a f10838q;

    /* renamed from: com.tencent.mm.plugin.account.ui.u0$a */
    public interface C1490a {
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.u0$b */
    public static class C1491b {

        /* renamed from: a */
        public TextView f10839a;

        /* renamed from: b */
        public ImageView f10840b;

        /* renamed from: c */
        public TextView f10841c;

        /* renamed from: d */
        public TextView f10842d;

        /* renamed from: e */
        public TextView f10843e;

        /* renamed from: f */
        public ImageView f10844f;
    }

    public C1489u0(Context context, C6975i1.C6977b bVar) {
        super(context, new C76174o());
        this.f24699h = bVar;
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C76174o oVar = (C76174o) obj;
        if (oVar == null) {
            oVar = new C76174o();
        }
        oVar.mo106412a(cursor);
        return oVar;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C1491b bVar;
        View view2;
        C76174o oVar = (C76174o) getItem(i);
        if (view == null) {
            bVar = new C1491b();
            view2 = View.inflate(this.f24696e, C0966R.C0971layout.f359668a63, (ViewGroup) null);
            bVar.f10840b = (ImageView) view2.findViewById(C0966R.C0970id.bqo);
            bVar.f10839a = (TextView) view2.findViewById(C0966R.C0970id.i98);
            bVar.f10841c = (TextView) view2.findViewById(C0966R.C0970id.f358989i93);
            bVar.f10842d = (TextView) view2.findViewById(C0966R.C0970id.i94);
            bVar.f10843e = (TextView) view2.findViewById(C0966R.C0970id.i96);
            bVar.f10844f = (ImageView) view2.findViewById(C0966R.C0970id.i9a);
            view2.setTag(bVar);
        } else {
            view2 = view;
            bVar = (C1491b) view.getTag();
        }
        TextView textView = bVar.f10839a;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f24696e;
        String str = oVar.f223171b;
        if (str == null) {
            str = "";
        }
        textView.setText(hVar.yp0(context, str, bVar.f10839a.getTextSize()));
        bVar.f10843e.setVisibility(8);
        bVar.f10844f.setVisibility(0);
        int i2 = this.f10836o[i];
        if (i2 == 0) {
            if (oVar.f223173d != 102) {
                C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
                String str2 = oVar.f223174e;
                if (str2 == null) {
                    str2 = "";
                }
                if (!Ni.mo69724s3(str2)) {
                    bVar.f10841c.setVisibility(8);
                    bVar.f10842d.setVisibility(0);
                }
            }
            if (oVar.f223173d == 102) {
                bVar.f10841c.setVisibility(8);
                bVar.f10842d.setVisibility(8);
                bVar.f10844f.setVisibility(8);
            } else {
                bVar.f10841c.setVisibility(0);
                bVar.f10841c.setText(C0966R.string.f28);
                bVar.f10841c.setTextColor(this.f24696e.getResources().getColor(C0966R.color.f3029co));
                bVar.f10842d.setVisibility(8);
            }
        } else if (i2 == 2) {
            bVar.f10842d.setVisibility(8);
            bVar.f10841c.setVisibility(0);
            bVar.f10841c.setText(C0966R.string.f2b);
            bVar.f10841c.setTextColor(this.f24696e.getResources().getColor(C0966R.color.f3030cp));
        }
        Bitmap hh = ((C76708i) C86312j.m106911c(C76708i.class)).mo106838hh("" + oVar.f223170a);
        if (hh == null) {
            bVar.f10840b.setImageDrawable(C76577a.m92158i(this.f24696e, C0966R.raw.default_avatar));
        } else {
            bVar.f10840b.setImageBitmap(hh);
        }
        return view2;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        C76175p xx02 = C75398e.xx0();
        String str = this.f10837p;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            xx02.getClass();
            if (str.length() > 0) {
                sb.append(" where ( ");
                sb.append("facebookfriend.fbname like '%" + str + "%' or ");
                sb.append("facebookfriend.nickname like '%" + str + "%' or ");
                sb.append("facebookfriend.username like '%" + str + "%' ) ");
            }
        }
        C91753f fVar = xx02.f223188d;
        mo7998r(fVar.rawQuery("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend  " + sb.toString() + " order by " + " case when status = 100 then 0  when status = 102 then 3  when status = 101 then 1 else 2 end " + " , " + "nicknamepyinitial", (String[]) null));
        this.f10836o = new int[getCount()];
        C1490a aVar = this.f10838q;
        if (!(aVar == null || this.f10837p == null)) {
            MMFBFriendUI.C1443e eVar = (MMFBFriendUI.C1443e) aVar;
            if (mo7992g().getCount() > 0) {
                MMFBFriendUI.this.f10718h.setVisibility(8);
            } else {
                MMFBFriendUI.this.f10718h.setVisibility(0);
            }
        }
        notifyDataSetChanged();
    }
}
