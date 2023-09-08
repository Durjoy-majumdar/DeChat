package com.tencent.p014mm.plugin.shake.p103ui;

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
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72992v4;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.shake.ui.b */
public class C71188b extends C6975i1<C72991u4> {

    /* renamed from: o */
    public MMActivity f206030o;

    /* renamed from: p */
    public int f206031p = -1;

    /* renamed from: q */
    public C72992v4 f206032q;

    /* renamed from: r */
    public MMSlideDelView.C73188i f206033r;

    /* renamed from: s */
    public MMSlideDelView.C73185e f206034s;

    /* renamed from: t */
    public MMSlideDelView.C73187h f206035t;

    /* renamed from: u */
    public MMSlideDelView.C73186f f206036u = MMSlideDelView.getItemStatusCallBack();

    /* renamed from: com.tencent.mm.plugin.shake.ui.b$a */
    public class C71189a implements View.OnClickListener {
        public C71189a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/shake/ui/SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105926v("MicroMsg.SayHiAdapter", "on delView clicked");
            C71188b.this.f206036u.mo97958c();
            MMSlideDelView.C73187h hVar = C71188b.this.f206035t;
            if (hVar != null) {
                hVar.mo7896a(view.getTag());
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/shake/ui/SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.shake.ui.b$b */
    public static class C71190b {

        /* renamed from: a */
        public TextView f206038a;

        /* renamed from: b */
        public TextView f206039b;

        /* renamed from: c */
        public ImageView f206040c;

        /* renamed from: d */
        public View f206041d;
    }

    public C71188b(Context context, C72992v4 v4Var, int i) {
        super(context, new C72991u4());
        this.f206030o = (MMActivity) context;
        this.f206031p = i;
        this.f206032q = v4Var;
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72991u4 u4Var = (C72991u4) obj;
        if (u4Var == null) {
            u4Var = new C72991u4();
        }
        u4Var.convertFrom(cursor);
        return u4Var;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C71190b bVar;
        MMSlideDelView mMSlideDelView;
        C72991u4 u4Var = (C72991u4) getItem(i);
        if (view == null) {
            MMSlideDelView mMSlideDelView2 = (MMSlideDelView) View.inflate(this.f206030o, C0966R.C0971layout.f6565ig, (ViewGroup) null);
            bVar = new C71190b();
            View inflate = View.inflate(this.f206030o, C0966R.C0971layout.f359957bu0, (ViewGroup) null);
            bVar.f206040c = (ImageView) inflate.findViewById(C0966R.C0970id.bqo);
            bVar.f206038a = (TextView) inflate.findViewById(C0966R.C0970id.c7k);
            bVar.f206039b = (TextView) inflate.findViewById(C0966R.C0970id.f359115j12);
            bVar.f206041d = mMSlideDelView2.findViewById(C0966R.C0970id.jmx);
            TextView textView = (TextView) mMSlideDelView2.findViewById(C0966R.C0970id.jmy);
            mMSlideDelView2.setView(inflate);
            mMSlideDelView2.setPerformItemClickListener(this.f206033r);
            mMSlideDelView2.setGetViewPositionCallback(this.f206034s);
            mMSlideDelView2.setItemStatusCallBack(this.f206036u);
            mMSlideDelView2.setEnable(false);
            mMSlideDelView2.setTag(bVar);
            mMSlideDelView = mMSlideDelView2;
        } else {
            bVar = (C71190b) view.getTag();
            mMSlideDelView = view;
        }
        bVar.f206041d.setTag(Long.valueOf(u4Var.field_svrid));
        bVar.f206041d.setOnClickListener(new C71189a());
        bVar.f206038a.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f206030o, C72963f4.C72971h.m85668v(u4Var.field_content).mo101038e(), bVar.f206038a.getTextSize()));
        bVar.f206039b.setText(u4Var.field_sayhicontent);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar.f206040c, u4Var.field_sayhiuser);
        return mMSlideDelView;
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        C72992v4 v4Var = this.f206032q;
        int i = this.f206031p;
        v4Var.getClass();
        mo7998r(v4Var.f212830d.rawQuery("SELECT * FROM " + v4Var.getTableName() + " where isSend = " + 0 + " ORDER BY createtime desc LIMIT " + i, (String[]) null));
        notifyDataSetChanged();
    }
}
