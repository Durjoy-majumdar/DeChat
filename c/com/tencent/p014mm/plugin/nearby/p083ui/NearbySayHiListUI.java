package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import cc2.C54713e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.AddFMessageCardClickEvent;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72957c4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import lc3.C10485b;
import nj3.C11184p0;
import nj3.C76879j;
import ns3.C11266d;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p214om.C11502f;
import p629ny.C76979h;
import qo3.C89779i0;
import uc3.C78146a;

/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI */
public class NearbySayHiListUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public C72957c4 f201681d = null;

    /* renamed from: e */
    public C69917m f201682e;

    /* renamed from: f */
    public ListView f201683f;

    /* renamed from: g */
    public int f201684g = 0;

    /* renamed from: h */
    public int f201685h = 0;

    /* renamed from: i */
    public int f201686i = 0;

    /* renamed from: j */
    public int f201687j = 0;

    /* renamed from: n */
    public C89779i0 f201688n = null;

    /* renamed from: o */
    public C54713e f201689o;

    /* renamed from: p */
    public View f201690p;

    /* renamed from: q */
    public boolean f201691q;

    /* renamed from: r */
    public long f201692r;

    /* renamed from: s */
    public C11184p0 f201693s = new C69903b();

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$a */
    public class C69902a implements View.OnClickListener {
        public C69902a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ListView listView = NearbySayHiListUI.this.f201683f;
            C9556a aVar = new C9556a();
            aVar.mo10233c(listView);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$10", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$10", "onClick", "(Landroid/view/View;)V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$b */
    public class C69903b implements C11184p0 {
        public C69903b() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C86709a0.m107523b().mo121108c();
            ((C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB()).mo100936jo(String.valueOf(NearbySayHiListUI.this.f201692r));
            NearbySayHiListUI.this.f201682e.mo7991f();
            NearbySayHiListUI nearbySayHiListUI = NearbySayHiListUI.this;
            int i2 = nearbySayHiListUI.f201685h;
            if (i2 > 0) {
                nearbySayHiListUI.f201685h = i2 - 1;
            }
            if (nearbySayHiListUI.f201685h == 0) {
                TextView textView = (TextView) nearbySayHiListUI.findViewById(C0966R.C0970id.f357933cj2);
                textView.setText(C0966R.string.iaz);
                textView.setVisibility(0);
                nearbySayHiListUI.enableOptionMenu(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$c */
    public class C69904c implements DialogInterface.OnClickListener {
        public C69904c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C86709a0.m107535s().mo121142i().mo119676J(4104, Boolean.TRUE);
            NearbySayHiListUI.this.setResult(-1);
            NearbySayHiListUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$d */
    public class C69905d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f201697d;

        public C69905d(View view) {
            this.f201697d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NearbySayHiListUI.this.f201684g += 8;
            Log.m105918d("MicroMsg.SayHiListUI", "dkfooter more btn:" + NearbySayHiListUI.this.f201684g);
            NearbySayHiListUI nearbySayHiListUI = NearbySayHiListUI.this;
            C69917m mVar = nearbySayHiListUI.f201682e;
            int i = nearbySayHiListUI.f201684g;
            mVar.mo5580b();
            mVar.f201711p = i;
            mVar.mo1333o();
            NearbySayHiListUI nearbySayHiListUI2 = NearbySayHiListUI.this;
            if (nearbySayHiListUI2.f201685h <= nearbySayHiListUI2.f201684g) {
                nearbySayHiListUI2.f201683f.removeFooterView(this.f201697d);
                Log.m105918d("MicroMsg.SayHiListUI", "dkfooter REMOVE more btn: " + NearbySayHiListUI.this.f201684g);
            }
            ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(7);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$e */
    public class C69906e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$e$a */
        public class C69907a implements DialogInterface.OnClickListener {
            public C69907a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C72957c4 c4Var = NearbySayHiListUI.this.f201681d;
                c4Var.f212645d.delete(c4Var.getTableName(), (String) null, (String[]) null);
                NearbySayHiListUI.this.f201682e.mo1333o();
                TextView textView = (TextView) NearbySayHiListUI.this.findViewById(C0966R.C0970id.f357933cj2);
                textView.setText(C0966R.string.iaz);
                textView.setVisibility(0);
                NearbySayHiListUI.this.enableOptionMenu(false);
                ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(9);
            }
        }

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$e$b */
        public class C69908b implements DialogInterface.OnClickListener {
            public C69908b(C69906e eVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(10);
            }
        }

        public C69906e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ((C11266d) C86312j.m106911c(C11266d.class)).Ob0(8);
            C76879j.m92717K(NearbySayHiListUI.this.getContext(), true, NearbySayHiListUI.this.getResources().getString(C0966R.string.iau), "", NearbySayHiListUI.this.getResources().getString(C0966R.string.iat), NearbySayHiListUI.this.getString(C0966R.string.f7926wf), new C69907a(), new C69908b(this));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$f */
    public class C69909f implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$f$a */
        public class C69910a implements DialogInterface.OnCancelListener {
            public C69910a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(NearbySayHiListUI.this.f201689o);
            }
        }

        public C69909f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NearbySayHiListUI.this.f201689o = new C54713e(2, 0.0f, 0.0f, 0, 0, "", "");
            C86709a0.m107524d().mo123460f(NearbySayHiListUI.this.f201689o);
            NearbySayHiListUI nearbySayHiListUI = NearbySayHiListUI.this;
            nearbySayHiListUI.f201688n = C76879j.m92723Q(nearbySayHiListUI.getContext(), NearbySayHiListUI.this.getString(C0966R.string.a3h), NearbySayHiListUI.this.getString(C0966R.string.h5h), true, true, new C69910a());
            C115669n.INSTANCE.kvStat(11429, "0");
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$g */
    public class C69911g implements MMSlideDelView.C73185e {
        public C69911g() {
        }

        /* renamed from: a */
        public int mo96224a(View view) {
            return NearbySayHiListUI.this.f201683f.getPositionForView(view);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$h */
    public class C69912h implements MMSlideDelView.C73188i {
        public C69912h() {
        }

        /* renamed from: a */
        public void mo96225a(View view, int i, int i2) {
            NearbySayHiListUI.this.f201683f.performItemClick(view, i, (long) i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$i */
    public class C69913i implements MMSlideDelView.C73187h {
        public C69913i() {
        }

        /* renamed from: a */
        public void mo7896a(Object obj) {
            if (obj == null) {
                Log.m105920e("MicroMsg.SayHiListUI", "onItemDel object null");
                return;
            }
            C86709a0.m107523b().mo121108c();
            ((C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB()).mo100936jo(obj.toString());
            NearbySayHiListUI.this.f201682e.mo7991f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$j */
    public class C69914j implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45082x0 f201706d;

        public C69914j(C45082x0 x0Var) {
            this.f201706d = x0Var;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i < NearbySayHiListUI.this.f201683f.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.SayHiListUI", "on header view long click, ignore");
                return true;
            }
            C45082x0 x0Var = this.f201706d;
            NearbySayHiListUI nearbySayHiListUI = NearbySayHiListUI.this;
            x0Var.mo70437c(view, i, j, nearbySayHiListUI, nearbySayHiListUI.f201693s);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$k */
    public class C69915k implements AdapterView.OnItemClickListener {
        public C69915k() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str;
            Class cls = C11502f.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C72956b4 b4Var = (C72956b4) NearbySayHiListUI.this.f201682e.getItem(NearbySayHiListUI.this.f201683f.getHeaderViewsCount() > 0 ? i - NearbySayHiListUI.this.f201683f.getHeaderViewsCount() : i);
            if (b4Var == null || (str = b4Var.field_content) == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C72963f4.C72971h v = C72963f4.C72971h.m85668v(str);
            Intent intent = new Intent();
            if (C78146a.m94354c()) {
                intent.putExtra("Chat_User", b4Var.field_sayhiencryptuser);
                intent.putExtra("lbs_mode", true);
                intent.putExtra("add_scene", 18);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent, NearbySayHiListUI.this);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", 5);
                intent2.putExtra("CONTACT_INFO_UI_SUB_SOURCE", NearbySayHiListUI.this.f201691q ? 503 : 502);
                intent2.putExtra("Contact_User", Util.isNullOrNil(v.f212737a) ? b4Var.field_sayhiuser : v.f212737a);
                intent2.putExtra("Contact_Alias", v.f212738b);
                intent2.putExtra("Contact_Nick", v.f212739c);
                intent2.putExtra("Contact_QuanPin", v.f212740d);
                intent2.putExtra("Contact_PyInitial", v.f212741e);
                intent2.putExtra("Contact_Sex", v.f212751o);
                intent2.putExtra("Contact_Signature", v.f212752p);
                intent2.putExtra("Contact_Scene", v.f212744h);
                intent2.putExtra("Contact_FMessageCard", true);
                intent2.putExtra("Contact_City", v.mo101036c());
                intent2.putExtra("Contact_Province", v.mo101044k());
                intent2.putExtra("Contact_Content", Util.isNullOrNil(b4Var.field_sayhicontent) ? NearbySayHiListUI.this.getString(C0966R.string.b8_) : b4Var.field_sayhicontent);
                intent2.putExtra("Contact_verify_Scene", v.f212744h);
                intent2.putExtra("Contact_Uin", v.f212747k);
                intent2.putExtra("Contact_QQNick", v.f212748l);
                intent2.putExtra("Contact_Mobile_MD5", v.f212745i);
                intent2.putExtra("User_From_Fmessage", true);
                intent2.putExtra("Contact_from_msgType", 37);
                intent2.putExtra("Verify_ticket", v.f212756t);
                intent2.putExtra("Contact_Source_FMessage", v.f212744h);
                intent2.putExtra("Contact_ShowFMessageList", true);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(v.f212737a);
                if (z1Var != null && ((int) z1Var.f108320R1) >= 0 && !z1Var.mo62927s3()) {
                    int i2 = v.f212759w;
                    if (i2 == 0 || i2 == 2 || i2 == 5) {
                        intent2.putExtra("User_Verify", true);
                    }
                    intent2.putExtra("Contact_IsLBSFriend", true);
                    intent2.putExtra("Sns_from_Scene", 18);
                }
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent2, NearbySayHiListUI.this);
                ((C11266d) C86312j.m106911c(C11266d.class)).F70(6, (long) i, v.f212751o);
            }
            AddFMessageCardClickEvent addFMessageCardClickEvent = new AddFMessageCardClickEvent();
            addFMessageCardClickEvent.f193470d.f193471a = v.f212744h;
            addFMessageCardClickEvent.publish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$l */
    public class C69916l implements MenuItem.OnMenuItemClickListener {
        public C69916l() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NearbySayHiListUI.this.hideVKB();
            NearbySayHiListUI.this.setResult(0);
            NearbySayHiListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$m */
    public class C69917m extends C6975i1<C72956b4> {

        /* renamed from: o */
        public MMActivity f201710o;

        /* renamed from: p */
        public int f201711p = -1;

        /* renamed from: q */
        public C72957c4 f201712q;

        /* renamed from: r */
        public MMSlideDelView.C73188i f201713r;

        /* renamed from: s */
        public MMSlideDelView.C73185e f201714s;

        /* renamed from: t */
        public MMSlideDelView.C73187h f201715t;

        /* renamed from: u */
        public MMSlideDelView.C73186f f201716u = MMSlideDelView.getItemStatusCallBack();

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$m$a */
        public class C69918a implements View.OnClickListener {
            public C69918a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105926v("MicroMsg.SayHiAdapter", "on delView clicked");
                C69917m.this.f201716u.mo97958c();
                MMSlideDelView.C73187h hVar = C69917m.this.f201715t;
                if (hVar != null) {
                    hVar.mo7896a(view.getTag());
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/nearby/ui/NearbySayHiListUI$SayHiAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI$m$b */
        public class C69919b {

            /* renamed from: a */
            public TextView f201718a;

            /* renamed from: b */
            public TextView f201719b;

            /* renamed from: c */
            public ImageView f201720c;

            /* renamed from: d */
            public View f201721d;

            public C69919b(C69917m mVar) {
            }
        }

        public C69917m(NearbySayHiListUI nearbySayHiListUI, Context context, C72957c4 c4Var, int i) {
            super(context, new C72956b4());
            this.f201710o = (MMActivity) context;
            this.f201711p = i;
            this.f201712q = c4Var;
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C72956b4 b4Var = (C72956b4) obj;
            if (b4Var == null) {
                b4Var = new C72956b4();
            }
            b4Var.convertFrom(cursor);
            return b4Var;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C69919b bVar;
            MMSlideDelView mMSlideDelView;
            Class cls = C76979h.class;
            C72956b4 b4Var = (C72956b4) getItem(i);
            if (view == null) {
                bVar = new C69919b(this);
                MMSlideDelView mMSlideDelView2 = (MMSlideDelView) View.inflate(this.f201710o, C0966R.C0971layout.f6565ig, (ViewGroup) null);
                View inflate = View.inflate(this.f201710o, C0966R.C0971layout.f359957bu0, (ViewGroup) null);
                bVar.f201720c = (ImageView) inflate.findViewById(C0966R.C0970id.bqo);
                bVar.f201718a = (TextView) inflate.findViewById(C0966R.C0970id.c7k);
                bVar.f201719b = (TextView) inflate.findViewById(C0966R.C0970id.f359115j12);
                bVar.f201721d = mMSlideDelView2.findViewById(C0966R.C0970id.jmx);
                TextView textView = (TextView) mMSlideDelView2.findViewById(C0966R.C0970id.jmy);
                mMSlideDelView2.setView(inflate);
                mMSlideDelView2.setPerformItemClickListener(this.f201713r);
                mMSlideDelView2.setGetViewPositionCallback(this.f201714s);
                mMSlideDelView2.setItemStatusCallBack(this.f201716u);
                mMSlideDelView2.setEnable(false);
                mMSlideDelView2.setTag(bVar);
                mMSlideDelView = mMSlideDelView2;
            } else {
                mMSlideDelView = view;
                bVar = (C69919b) view.getTag();
            }
            bVar.f201718a.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f201710o, b4Var.field_flag != 0 ? C72963f4.C72971h.m85668v(b4Var.field_content).f212739c : b4Var.field_talker, bVar.f201718a.getTextSize()));
            bVar.f201719b.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f201710o, b4Var.field_sayhicontent, bVar.f201719b.getTextSize()));
            bVar.f201721d.setTag(Long.valueOf(b4Var.field_svrid));
            bVar.f201721d.setOnClickListener(new C69918a());
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(bVar.f201720c, b4Var.field_sayhiuser);
            return mMSlideDelView;
        }

        /* renamed from: l */
        public void mo1332l() {
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            if (C78146a.m94354c()) {
                C72957c4 c4Var = this.f201712q;
                int i = this.f201711p;
                c4Var.getClass();
                mo7998r(c4Var.f212645d.rawQuery("SELECT a.* FROM (" + ("SELECT sayhiencryptuser,max(createtime) createtime FROM " + c4Var.getTableName() + " where isSend = " + 0 + " GROUP BY sayhiencryptuser LIMIT " + i) + ") b left join " + c4Var.getTableName() + " a on b.sayhiencryptuser=a.sayhiencryptuser and b.createtime=a.createtime where a.isSend = " + 0 + " ORDER BY a.createtime desc LIMIT " + i, (String[]) null));
            } else {
                C72957c4 c4Var2 = this.f201712q;
                int i2 = this.f201711p;
                c4Var2.getClass();
                mo7998r(c4Var2.f212645d.rawQuery("SELECT * FROM " + c4Var2.getTableName() + " where isSend = " + 0 + " ORDER BY createtime desc LIMIT " + i2, (String[]) null));
            }
            notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b5v;
    }

    public void initView() {
        int i;
        this.f201683f = (ListView) findViewById(C0966R.C0970id.j0y);
        if (!C78146a.m94354c()) {
            View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f359958bu1, (ViewGroup) null);
            inflate.setOnClickListener(new C69905d(inflate));
            int i2 = this.f201685h;
            if (i2 > 0 && this.f201684g < i2) {
                this.f201683f.addFooterView(inflate);
            }
        }
        addTextOptionMenu(0, getString(C0966R.string.f7930wk), new C69906e());
        if (this.f201685h == 0) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
            textView.setText(C0966R.string.iaz);
            textView.setVisibility(0);
            enableOptionMenu(false);
        }
        if (this.f201691q && (i = this.f201687j) != 0 && this.f201686i >= i && Util.isOverseasUser(this)) {
            CleanLocationHeaderView cleanLocationHeaderView = new CleanLocationHeaderView(this);
            this.f201690p = cleanLocationHeaderView;
            cleanLocationHeaderView.setOnClickListener(new C69909f());
            this.f201683f.addHeaderView(this.f201690p);
        }
        C69917m mVar = new C69917m(this, this, this.f201681d, this.f201684g);
        this.f201682e = mVar;
        mVar.f201714s = new C69911g();
        mVar.f201713r = new C69912h();
        mVar.f201715t = new C69913i();
        this.f201683f.setAdapter(mVar);
        this.f201683f.setOnItemLongClickListener(new C69914j(new C45082x0(this)));
        this.f201683f.setOnItemClickListener(new C69915k());
        setBackBtn(new C69916l());
        setToTop(new C69902a());
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f201687j = Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ThresholdToCleanLocation"));
        this.f201691q = getIntent().getBooleanExtra("show_clear_header", false);
        C86709a0.m107523b().mo121108c();
        this.f201681d = (C72957c4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96099XB();
        setMMTitle((int) C0966R.string.iaw);
        this.f201686i = this.f201681d.mo100937kD();
        this.f201685h = this.f201681d.getCount();
        if (C78146a.m94354c()) {
            this.f201684g = this.f201685h;
        } else {
            int i = this.f201686i;
            if (i == 0) {
                i = 8;
            }
            this.f201684g = i;
        }
        C72957c4 c4Var = this.f201681d;
        c4Var.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", 4);
        if (c4Var.f212645d.update(c4Var.getTableName(), contentValues, "status!=? ", new String[]{WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL}) != 0) {
            c4Var.doNotify();
        }
        initView();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        C72956b4 b4Var = (C72956b4) this.f201682e.getItem(adapterContextMenuInfo.position);
        if (b4Var == null) {
            Log.m105920e("MicroMsg.SayHiListUI", "onItemLongClick, item is null, pos = " + adapterContextMenuInfo.position);
            return;
        }
        contextMenu.add(0, 0, 0, C0966R.string.f7944x1);
        this.f201692r = b4Var.field_svrid;
    }

    public void onDestroy() {
        this.f201682e.mo5580b();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        C86709a0.m107524d().mo123470p(148, this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (this.f201685h != this.f201681d.getCount()) {
            int count = this.f201681d.getCount();
            this.f201685h = count;
            if (count == 0) {
                TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
                textView.setText(C0966R.string.iaz);
                textView.setVisibility(0);
                enableOptionMenu(false);
            }
            this.f201682e.mo1333o();
        }
        this.f201682e.notifyDataSetChanged();
        C86709a0.m107524d().mo123455a(148, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SayHiListUI", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f201688n;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f201688n = null;
        }
        if (i != 0 || i2 != 0) {
            Log.m105928w("MicroMsg.SayHiListUI", "[cpan] clear location failed.");
        } else if (((C54713e) yVar).mo75607f() == 2) {
            C76879j.m92749t(getContext(), getString(C0966R.string.h5g), "", new C69904c());
            this.f201689o = null;
        }
    }
}
